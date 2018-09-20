package zdoctor.zcoremod.tweaks;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.EntityDataManager;

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

	public static interface ExtendedEntity {

		public float getLastHealth();

		public void setLastHealth(float lastHealth);

	}
}
