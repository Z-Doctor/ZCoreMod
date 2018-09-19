package zdoctor.zcoremod.helpers;

import javax.annotation.Nonnull;

import net.minecraft.entity.EntityLivingBase;
import zdoctor.zcoremod.tweaks.EntityTweaks;

public class EntityHelper {
	
	static {
		
	}

	public static float getLastHealth(@Nonnull EntityLivingBase entity) {
		return 0f;
		
//		assert(EntityTweaks.LAST_HEALTH != null);
//		
//		return entity.getDataManager().get(EntityTweaks.LAST_HEALTH);
	}
}
