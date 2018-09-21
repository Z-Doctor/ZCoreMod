package zdoctor.zcoremod.map.minecraft.entity.ai;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityAILandOnOwnersShoulder {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "xi";
		else
			return "net/minecraft/entity/ai/EntityAILandOnOwnersShoulder";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "xi";
		else
			return "EntityAILandOnOwnersShoulder";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lxi;";
		else
			return "Lnet/minecraft/entity/ai/EntityAILandOnOwnersShoulder;";
	}

	/**
	 * <p>
	 * Name: owner
	 * </p>
	 */
	public static McObfPair field_192383_b = McMappingDatabase.getSRG("field_192383_b");

	/**
	 * <p>
	 * Name: isInterruptible
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75252_g = McMappingDatabase.getSRG("EntityAILandOnOwnersShoulder.func_75252_g");

	/**
	 * <p>
	 * Name: isSittingOnShoulder
	 * </p>
	 */
	public static McObfPair field_192384_c = McMappingDatabase.getSRG("field_192384_c");

	/**
	 * <p>
	 * Name: entity
	 * </p>
	 */
	public static McObfPair field_192382_a = McMappingDatabase.getSRG("field_192382_a");

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityAILandOnOwnersShoulder.func_75250_a");

	/**
	 * <p>
	 * Name: startExecuting
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75249_e = McMappingDatabase.getSRG("EntityAILandOnOwnersShoulder.func_75249_e");

	/**
	 * <p>
	 * Name: updateTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75246_d = McMappingDatabase.getSRG("EntityAILandOnOwnersShoulder.func_75246_d");

}
