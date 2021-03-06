package growthcraft.hops.handlers;

import growthcraft.cellar.api.definition.IObjectBooze;
import growthcraft.cellar.common.definition.BlockBoozeDefinition;
import growthcraft.cellar.common.definition.BoozeDefinition;
import growthcraft.core.api.definition.IItemStackFactory;
import growthcraft.core.api.definition.IObjectVariant;
import growthcraft.hops.init.GrowthcraftHopsBlocks;
import growthcraft.hops.init.GrowthcraftHopsFluids;
import growthcraft.hops.init.GrowthcraftHopsItems;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;

public class EnumHandler {
	public enum HopAleTypes implements IObjectBooze, IStringSerializable, IItemStackFactory, IObjectVariant {
		ALE_UNHOPPED(0, "unhopped"),
		ALE_NORMAL(1, "normal"),
		ALE_POTENT(2, "potent"),
		ALE_EXTENDED(3, "extended"),
		ALE_YOUNG(4, "young"),
		ALE_HYPEREXTENDED(5, "hyperextended"),
		ALE_LAGER(6, "lager"),
		ALE_INTOXICATED(7, "intoxicated"),
		ALE_POISONED(8, "poisoned");
		
        private int ID;
        private String NAME;
        
        HopAleTypes(int id, String name) {
            this.ID = id;
            this.NAME = name;
        }
        
        @Override
        public String toString() {
            return getName();
        }

		@Override
		public int getVariantID() {
			return this.ID;
		}

		@Override
		public ItemStack asStack(int size) {
			return GrowthcraftHopsItems.hopAleBottle.asStack(size, getVariantID());
		}

		@Override
		public ItemStack asStack() {
			return asStack(1);
		}

		@Override
		public String getName() {
			return this.NAME;
		}

		@Override
		public BoozeDefinition getFluidDefinition() {
			return GrowthcraftHopsFluids.hopAleBooze[ordinal()];
		}

		@Override
		public BlockBoozeDefinition getBoozeBlockDefinition() {
			return GrowthcraftHopsBlocks.hopAleFluidBlocks[ordinal()];
		}
	}
	
	public enum LagerTypes implements IObjectBooze, IStringSerializable, IItemStackFactory, IObjectVariant {
		LAGER_YOUNG(0, "young"),
		LAGER_NORMAL(1, "normal"),
		LAGER_POTENT(2, "potent"),
		LAGER_EXTENDED(3, "extended"),
		LAGER_HYPEREXTENDED(4, "hyperextended"),
		LAGER_INTOXICATED(5, "intoxicated"),
		LAGER_POISONED(6, "poisoned");
		
        private int ID;
        private String NAME;
        
        LagerTypes(int id, String name) {
            this.ID = id;
            this.NAME = name;
        }
        
        @Override
        public String toString() {
            return getName();
        }

		@Override
		public int getVariantID() {
			return this.ID;
		}

		@Override
		public ItemStack asStack(int size) {
			return GrowthcraftHopsItems.lagerBottle.asStack(size, getVariantID());
		}

		@Override
		public ItemStack asStack() {
			return asStack(1);
		}

		@Override
		public String getName() {
			return this.NAME;
		}

		@Override
		public BoozeDefinition getFluidDefinition() {
			return GrowthcraftHopsFluids.lagerBooze[ordinal()];
		}

		@Override
		public BlockBoozeDefinition getBoozeBlockDefinition() {
			return GrowthcraftHopsBlocks.lagerFluidBlocks[ordinal()];
		}
	}

}
