package zdoctor.zcoremod.helpers;

import javax.annotation.Nonnull;

import net.minecraft.entity.EntityLivingBase;
import zdoctor.zcoremod.tweaks.EntityTweaks;

public class EntityHelper {

	public static float getLastHealth(@Nonnull EntityLivingBase entity) {
		return ((EntityTweaks.ExtendedEntity) entity).getLastHealth();
	}

	public static void setLastHealth(@Nonnull EntityLivingBase entity, float lastHealth) {
		((EntityTweaks.ExtendedEntity) entity).setLastHealth(lastHealth);
	}

}
