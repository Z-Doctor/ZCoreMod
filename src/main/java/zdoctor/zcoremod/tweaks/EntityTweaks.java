package zdoctor.zcoremod.tweaks;

import java.util.Collection;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class EntityTweaks {
	public static DataParameter<Float> LAST_HEALTH;
	public static DataParameter<NBTTagCompound> POTION_WATCHER;

	public static void entityInit(EntityDataManager dataManager) {
		dataManager.register(LAST_HEALTH, 1.0F);
		dataManager.register(POTION_WATCHER, new NBTTagCompound());
	}

	public static void readNbt(EntityLivingBase entity, NBTTagCompound compound) {
		if (compound.hasKey("LastHealth", 99)) {
			((EntityTweaks.ExtendedEntity) entity).setLastHealth(compound.getFloat("LastHealth"));
		}
	}

	public static void writeNbt(EntityLivingBase entity, NBTTagCompound compound) {
		compound.setFloat("LastHealth", ((EntityTweaks.ExtendedEntity) entity).getLastHealth());
	}

	public static void updatePotionMetadata(EntityLivingBase entity, Collection<PotionEffect> collection) {
		World world = entity.world;

		if (!world.isRemote) {
			NBTTagList nbttaglist = new NBTTagList();
			for (PotionEffect potioneffect : collection) {
				nbttaglist.appendTag(potioneffect.writeCustomPotionEffectToNBT(new NBTTagCompound()));
			}
			NBTTagCompound compound = new NBTTagCompound();
			compound.setTag("ActiveEffects", nbttaglist);

			entity.getDataManager().set(POTION_WATCHER, compound);
		}
	}

	public static void resetPotionEffectMetadata(EntityLivingBase entity) {
		entity.getDataManager().set(POTION_WATCHER, new NBTTagCompound());
	}

	public static void notifyDataManagerChange(EntityLivingBase entity, DataParameter<?> key) {
		World world = entity.world;
		if (POTION_WATCHER.equals(key) && world.isRemote) {
			NBTTagList nbttaglist = entity.getDataManager().get(POTION_WATCHER).getTagList("ActiveEffects", 10);
			entity.clearActivePotions();
			entity.getActivePotionMap().clear();
			for (int i = 0; i < nbttaglist.tagCount(); ++i) {
				NBTTagCompound nbttagcompound = nbttaglist.getCompoundTagAt(i);
				PotionEffect potioneffect = PotionEffect.readCustomPotionEffectFromNBT(nbttagcompound);
				if (potioneffect != null) {
					entity.addPotionEffect(potioneffect);
				}
			}
		}
	}

	public static interface ExtendedEntity {

		public float getLastHealth();

		public void setLastHealth(float lastHealth);

	}
}
