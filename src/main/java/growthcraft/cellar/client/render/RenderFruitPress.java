package growthcraft.cellar.client.render;

import javax.annotation.Nonnull;

import growthcraft.cellar.common.tileentity.TileEntityFruitPress;
import growthcraft.core.client.render.TileFluidTanksSpecialRenderer;
import growthcraft.core.utils.BBox;

public class RenderFruitPress extends TileFluidTanksSpecialRenderer<TileEntityFruitPress> {
	private static final BBox fluidBBox = BBox.newCube(3.5, 4, 3.5, 9, 10, 9).scale(1.0/16.0);
	
	public RenderFruitPress() {
		super(fluidBBox);
	}

	@Override
	public void renderTileEntityAt(@Nonnull TileEntityFruitPress te, double x, double y, double z, float partialTicks, int destroyStage) {
		renderMaxFluid(te, x, y, z);
	}
}
