package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EnumParticleTypes {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "fj";
		else
			return "net/minecraft/util/EnumParticleTypes";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "fj";
		else
			return "EnumParticleTypes";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lfj;";
		else
			return "Lnet/minecraft/util/EnumParticleTypes;";
	}

	/**
	 * <p>
	 * Name: shouldIgnoreRange
	 * </p>
	 */
	public static McObfPair field_179371_S = McMappingDatabase.getSRG("field_179371_S");

	/**
	 * <p>
	 * Name: getParticleID
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_179348_c = McMappingDatabase.getSRG("EnumParticleTypes.func_179348_c");

	/**
	 * <p>
	 * Name: particleName
	 * </p>
	 */
	public static McObfPair field_179369_Q = McMappingDatabase.getSRG("field_179369_Q");

	/**
	 * <p>
	 * Name: getParticleName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_179346_b = McMappingDatabase.getSRG("EnumParticleTypes.func_179346_b");

	/**
	 * <p>
	 * Name: getParticleNames
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Set;]
	 * </p>
	 */
	public static McObfPair func_186832_a = McMappingDatabase.getSRG("EnumParticleTypes.func_186832_a");

	/**
	 * <p>
	 * Name: getArgumentCount
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_179345_d = McMappingDatabase.getSRG("EnumParticleTypes.func_179345_d");

	/**
	 * <p>
	 * Name: particleID
	 * </p>
	 */
	public static McObfPair field_179372_R = McMappingDatabase.getSRG("field_179372_R");

	/**
	 * <p>
	 * Name: getByName
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/util/EnumParticleTypes;]
	 * </p>
	 */
	public static McObfPair func_186831_a = McMappingDatabase.getSRG("EnumParticleTypes.func_186831_a");

	/**
	 * <p>
	 * Name: PARTICLES
	 * </p>
	 */
	public static McObfPair field_179365_U = McMappingDatabase.getSRG("field_179365_U");

	/**
	 * <p>
	 * Name: BY_NAME
	 * </p>
	 */
	public static McObfPair field_186837_Z = McMappingDatabase.getSRG("field_186837_Z");

	/**
	 * <p>
	 * Name: argumentCount
	 * </p>
	 */
	public static McObfPair field_179366_T = McMappingDatabase.getSRG("field_179366_T");

	/**
	 * <p>
	 * Name: getShouldIgnoreRange
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_179344_e = McMappingDatabase.getSRG("EnumParticleTypes.func_179344_e");

	/**
	 * <p>
	 * Name: getParticleFromId
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/util/EnumParticleTypes;]
	 * </p>
	 */
	public static McObfPair func_179342_a = McMappingDatabase.getSRG("EnumParticleTypes.func_179342_a");

}
