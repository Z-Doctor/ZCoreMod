package zdoctor.zcoremod.map.minecraft.entity.ai;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityAISit {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "yi";
		else
			return "net/minecraft/entity/ai/EntityAISit";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "yi";
		else
			return "EntityAISit";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lyi;";
		else
			return "Lnet/minecraft/entity/ai/EntityAISit;";
	}

	/**
	 * <p>
	 * Name: startExecuting
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75249_e = McMappingDatabase.getSRG("EntityAISit.func_75249_e");

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityAISit.func_75250_a");

	/**
	 * <p>
	 * Name: setSitting
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_75270_a = McMappingDatabase.getSRG("EntityAISit.func_75270_a");

	/**
	 * <p>
	 * Name: isSitting
	 * </p>
	 */
	public static McObfPair field_75271_b = McMappingDatabase.getSRG("field_75271_b");

	/**
	 * <p>
	 * Name: tameable
	 * </p>
	 */
	public static McObfPair field_75272_a = McMappingDatabase.getSRG("field_75272_a");

	/**
	 * <p>
	 * Name: resetTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75251_c = McMappingDatabase.getSRG("EntityAISit.func_75251_c");

}
