package zdoctor.zcoremod.map.minecraft.entity.ai;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityAIMoveIndoors {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "xp";
		else
			return "net/minecraft/entity/ai/EntityAIMoveIndoors";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "xp";
		else
			return "EntityAIMoveIndoors";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lxp;";
		else
			return "Lnet/minecraft/entity/ai/EntityAIMoveIndoors;";
	}

	/**
	 * <p>
	 * Name: insidePosZ
	 * </p>
	 */
	public static McObfPair field_75421_d = McMappingDatabase.getSRG("field_75421_d");

	/**
	 * <p>
	 * Name: entity
	 * </p>
	 */
	public static McObfPair field_75424_a = McMappingDatabase.getSRG("field_75424_a");

	/**
	 * <p>
	 * Name: resetTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75251_c = McMappingDatabase.getSRG("EntityAIMoveIndoors.func_75251_c");

	/**
	 * <p>
	 * Name: startExecuting
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75249_e = McMappingDatabase.getSRG("EntityAIMoveIndoors.func_75249_e");

	/**
	 * <p>
	 * Name: doorInfo
	 * </p>
	 */
	public static McObfPair field_75422_b = McMappingDatabase.getSRG("field_75422_b");

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityAIMoveIndoors.func_75250_a");

	/**
	 * <p>
	 * Name: insidePosX
	 * </p>
	 */
	public static McObfPair field_75423_c = McMappingDatabase.getSRG("field_75423_c");

	/**
	 * <p>
	 * Name: shouldContinueExecuting
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75253_b = McMappingDatabase.getSRG("EntityAIMoveIndoors.func_75253_b");

}
