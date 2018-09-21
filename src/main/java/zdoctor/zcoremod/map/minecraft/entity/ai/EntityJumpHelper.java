package zdoctor.zcoremod.map.minecraft.entity.ai;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityJumpHelper {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "wo";
		else
			return "net/minecraft/entity/ai/EntityJumpHelper";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "wo";
		else
			return "EntityJumpHelper";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lwo;";
		else
			return "Lnet/minecraft/entity/ai/EntityJumpHelper;";
	}

	/**
	 * <p>
	 * Name: isJumping
	 * </p>
	 */
	public static McObfPair field_75662_b = McMappingDatabase.getSRG("field_75662_b");

	/**
	 * <p>
	 * Name: doJump
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75661_b = McMappingDatabase.getSRG("EntityJumpHelper.func_75661_b");

	/**
	 * <p>
	 * Name: entity
	 * </p>
	 */
	public static McObfPair field_75663_a = McMappingDatabase.getSRG("field_75663_a");

	/**
	 * <p>
	 * Name: setJumping
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75660_a = McMappingDatabase.getSRG("EntityJumpHelper.func_75660_a");

}
