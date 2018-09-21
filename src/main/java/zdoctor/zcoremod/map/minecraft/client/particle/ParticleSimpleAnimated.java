package zdoctor.zcoremod.map.minecraft.client.particle;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ParticleSimpleAnimated {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "btl";
		else
			return "net/minecraft/client/particle/ParticleSimpleAnimated";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "btl";
		else
			return "ParticleSimpleAnimated";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbtl;";
		else
			return "Lnet/minecraft/client/particle/ParticleSimpleAnimated;";
	}

	/**
	 * <p>
	 * Name: getBrightnessForRender
	 * </p>
	 * <p>
	 * Desc: [(F)I]
	 * </p>
	 */
	public static McObfPair func_189214_a = McMappingDatabase.getSRG("ParticleSimpleAnimated.func_189214_a");

	/**
	 * <p>
	 * Name: fadeTargetBlue
	 * </p>
	 */
	public static McObfPair field_187152_K = McMappingDatabase.getSRG("field_187152_K");

	/**
	 * <p>
	 * Name: fadeTargetGreen
	 * </p>
	 */
	public static McObfPair field_187151_J = McMappingDatabase.getSRG("field_187151_J");

	/**
	 * <p>
	 * Name: setColor
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_187146_c = McMappingDatabase.getSRG("ParticleSimpleAnimated.func_187146_c");

	/**
	 * <p>
	 * Name: shouldDisableDepth
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_187111_c = McMappingDatabase.getSRG("ParticleSimpleAnimated.func_187111_c");

	/**
	 * <p>
	 * Name: yAccel
	 * </p>
	 */
	public static McObfPair field_187149_H = McMappingDatabase.getSRG("field_187149_H");

	/**
	 * <p>
	 * Name: setBaseAirFriction
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_191238_f = McMappingDatabase.getSRG("ParticleSimpleAnimated.func_191238_f");

	/**
	 * <p>
	 * Name: setColorFade
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_187145_d = McMappingDatabase.getSRG("ParticleSimpleAnimated.func_187145_d");

	/**
	 * <p>
	 * Name: textureIdx
	 * </p>
	 */
	public static McObfPair field_187147_a = McMappingDatabase.getSRG("field_187147_a");

	/**
	 * <p>
	 * Name: numAgingFrames
	 * </p>
	 */
	public static McObfPair field_187148_G = McMappingDatabase.getSRG("field_187148_G");

	/**
	 * <p>
	 * Name: baseAirFriction
	 * </p>
	 */
	public static McObfPair field_191239_M = McMappingDatabase.getSRG("field_191239_M");

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_189213_a = McMappingDatabase.getSRG("ParticleSimpleAnimated.func_189213_a");

	/**
	 * <p>
	 * Name: fadingColor
	 * </p>
	 */
	public static McObfPair field_187153_L = McMappingDatabase.getSRG("field_187153_L");

	/**
	 * <p>
	 * Name: fadeTargetRed
	 * </p>
	 */
	public static McObfPair field_187150_I = McMappingDatabase.getSRG("field_187150_I");

}
