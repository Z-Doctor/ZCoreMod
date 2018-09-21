package zdoctor.zcoremod.map.minecraft.entity.ai;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityAICreeperSwell {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "yj";
		else
			return "net/minecraft/entity/ai/EntityAICreeperSwell";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "yj";
		else
			return "EntityAICreeperSwell";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lyj;";
		else
			return "Lnet/minecraft/entity/ai/EntityAICreeperSwell;";
	}

	/**
	 * <p>
	 * Name: updateTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75246_d = McMappingDatabase.getSRG("EntityAICreeperSwell.func_75246_d");

	/**
	 * <p>
	 * Name: swellingCreeper
	 * </p>
	 */
	public static McObfPair field_75269_a = McMappingDatabase.getSRG("field_75269_a");

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityAICreeperSwell.func_75250_a");

	/**
	 * <p>
	 * Name: resetTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75251_c = McMappingDatabase.getSRG("EntityAICreeperSwell.func_75251_c");

	/**
	 * <p>
	 * Name: startExecuting
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75249_e = McMappingDatabase.getSRG("EntityAICreeperSwell.func_75249_e");

	/**
	 * <p>
	 * Name: creeperAttackTarget
	 * </p>
	 */
	public static McObfPair field_75268_b = McMappingDatabase.getSRG("field_75268_b");

}
