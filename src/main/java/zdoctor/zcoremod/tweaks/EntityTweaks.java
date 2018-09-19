package zdoctor.zcoremod.tweaks;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.EntityDataManager;

public class EntityTweaks {
	public static DataParameter<Float> LAST_HEALTH;

	public static void entityInit(EntityLivingBase entity, EntityDataManager dataManager) {
		System.out.println("Reg: " + entity.getClass() + "." + dataManager);
		dataManager.register(LAST_HEALTH, 1.0F);
	}

}
