package zdoctor.zcoremod.map.minecraft.client.particle;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Particle {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "btf";
		else
			return "net/minecraft/client/particle/Particle";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "btf";
		else
			return "Particle";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbtf;";
		else
			return "Lnet/minecraft/client/particle/Particle;";
	}

	/**
	 * <p>
	 * Name: cameraViewDir
	 * </p>
	 */
	public static McObfPair field_190016_K = McMappingDatabase.getSRG("field_190016_K");

	/**
	 * <p>
	 * Name: getRedColorF
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_70534_d = McMappingDatabase.getSRG("Particle.func_70534_d");

	/**
	 * <p>
	 * Name: height
	 * </p>
	 */
	public static McObfPair field_187135_o = McMappingDatabase.getSRG("field_187135_o");

	/**
	 * <p>
	 * Name: isAlive
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_187113_k = McMappingDatabase.getSRG("Particle.func_187113_k");

	/**
	 * <p>
	 * Name: shouldDisableDepth
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_187111_c = McMappingDatabase.getSRG("Particle.func_187111_c");

	/**
	 * <p>
	 * Name: interpPosZ
	 * </p>
	 */
	public static McObfPair field_70555_ap = McMappingDatabase.getSRG("field_70555_ap");

	/**
	 * <p>
	 * Name: getFXLayer
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70537_b = McMappingDatabase.getSRG("Particle.func_70537_b");

	/**
	 * <p>
	 * Name: getBoundingBox
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_187116_l = McMappingDatabase.getSRG("Particle.func_187116_l");

	/**
	 * <p>
	 * Name: prevParticleAngle
	 * </p>
	 */
	public static McObfPair field_190015_G = McMappingDatabase.getSRG("field_190015_G");

	/**
	 * <p>
	 * Name: width
	 * </p>
	 */
	public static McObfPair field_187134_n = McMappingDatabase.getSRG("field_187134_n");

	/**
	 * <p>
	 * Name: particleTextureIndexY
	 * </p>
	 */
	public static McObfPair field_94055_c = McMappingDatabase.getSRG("field_94055_c");

	/**
	 * <p>
	 * Name: motionY
	 * </p>
	 */
	public static McObfPair field_187130_j = McMappingDatabase.getSRG("field_187130_j");

	/**
	 * <p>
	 * Name: prevPosX
	 * </p>
	 */
	public static McObfPair field_187123_c = McMappingDatabase.getSRG("field_187123_c");

	/**
	 * <p>
	 * Name: getBrightnessForRender
	 * </p>
	 * <p>
	 * Desc: [(F)I]
	 * </p>
	 */
	public static McObfPair func_189214_a = McMappingDatabase.getSRG("Particle.func_189214_a");

	/**
	 * <p>
	 * Name: particleRed
	 * </p>
	 */
	public static McObfPair field_70552_h = McMappingDatabase.getSRG("field_70552_h");

	/**
	 * <p>
	 * Name: posY
	 * </p>
	 */
	public static McObfPair field_187127_g = McMappingDatabase.getSRG("field_187127_g");

	/**
	 * <p>
	 * Name: setRBGColorF
	 * </p>
	 * <p>
	 * Desc: [(FFF)V]
	 * </p>
	 */
	public static McObfPair func_70538_b = McMappingDatabase.getSRG("Particle.func_70538_b");

	/**
	 * <p>
	 * Name: prevPosY
	 * </p>
	 */
	public static McObfPair field_187124_d = McMappingDatabase.getSRG("field_187124_d");

	/**
	 * <p>
	 * Name: setExpired
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_187112_i = McMappingDatabase.getSRG("Particle.func_187112_i");

	/**
	 * <p>
	 * Name: particleScale
	 * </p>
	 */
	public static McObfPair field_70544_f = McMappingDatabase.getSRG("field_70544_f");

	/**
	 * <p>
	 * Name: particleGreen
	 * </p>
	 */
	public static McObfPair field_70553_i = McMappingDatabase.getSRG("field_70553_i");

	/**
	 * <p>
	 * Name: prevPosZ
	 * </p>
	 */
	public static McObfPair field_187125_e = McMappingDatabase.getSRG("field_187125_e");

	/**
	 * <p>
	 * Name: setSize
	 * </p>
	 * <p>
	 * Desc: [(FF)V]
	 * </p>
	 */
	public static McObfPair func_187115_a = McMappingDatabase.getSRG("Particle.func_187115_a");

	/**
	 * <p>
	 * Name: resetPositionToBB
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_187118_j = McMappingDatabase.getSRG("Particle.func_187118_j");

	/**
	 * <p>
	 * Name: motionX
	 * </p>
	 */
	public static McObfPair field_187129_i = McMappingDatabase.getSRG("field_187129_i");

	/**
	 * <p>
	 * Name: world
	 * </p>
	 */
	public static McObfPair field_187122_b = McMappingDatabase.getSRG("field_187122_b");

	/**
	 * <p>
	 * Name: setAlphaF
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_82338_g = McMappingDatabase.getSRG("Particle.func_82338_g");

	/**
	 * <p>
	 * Name: setPosition
	 * </p>
	 * <p>
	 * Desc: [(DDD)V]
	 * </p>
	 */
	public static McObfPair func_187109_b = McMappingDatabase.getSRG("Particle.func_187109_b");

	/**
	 * <p>
	 * Name: isExpired
	 * </p>
	 */
	public static McObfPair field_187133_m = McMappingDatabase.getSRG("field_187133_m");

	/**
	 * <p>
	 * Name: getBlueColorF
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_70535_g = McMappingDatabase.getSRG("Particle.func_70535_g");

	/**
	 * <p>
	 * Name: particleTexture
	 * </p>
	 */
	public static McObfPair field_187119_C = McMappingDatabase.getSRG("field_187119_C");

	/**
	 * <p>
	 * Name: setMaxAge
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_187114_a = McMappingDatabase.getSRG("Particle.func_187114_a");

	/**
	 * <p>
	 * Name: canCollide
	 * </p>
	 */
	public static McObfPair field_190017_n = McMappingDatabase.getSRG("field_190017_n");

	/**
	 * <p>
	 * Name: setParticleTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/texture/TextureAtlasSprite;)V]
	 * </p>
	 */
	public static McObfPair func_187117_a = McMappingDatabase.getSRG("Particle.func_187117_a");

	/**
	 * <p>
	 * Name: setParticleTextureIndex
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_70536_a = McMappingDatabase.getSRG("Particle.func_70536_a");

	/**
	 * <p>
	 * Name: particleTextureJitterY
	 * </p>
	 */
	public static McObfPair field_70549_c = McMappingDatabase.getSRG("field_70549_c");

	/**
	 * <p>
	 * Name: nextTextureIndexX
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_94053_h = McMappingDatabase.getSRG("Particle.func_94053_h");

	/**
	 * <p>
	 * Name: particleTextureJitterX
	 * </p>
	 */
	public static McObfPair field_70548_b = McMappingDatabase.getSRG("field_70548_b");

	/**
	 * <p>
	 * Name: interpPosX
	 * </p>
	 */
	public static McObfPair field_70556_an = McMappingDatabase.getSRG("field_70556_an");

	/**
	 * <p>
	 * Name: EMPTY_AABB
	 * </p>
	 */
	public static McObfPair field_187121_a = McMappingDatabase.getSRG("field_187121_a");

	/**
	 * <p>
	 * Name: particleAngle
	 * </p>
	 */
	public static McObfPair field_190014_F = McMappingDatabase.getSRG("field_190014_F");

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_189213_a = McMappingDatabase.getSRG("Particle.func_189213_a");

	/**
	 * <p>
	 * Name: rand
	 * </p>
	 */
	public static McObfPair field_187136_p = McMappingDatabase.getSRG("field_187136_p");

	/**
	 * <p>
	 * Name: particleAlpha
	 * </p>
	 */
	public static McObfPair field_82339_as = McMappingDatabase.getSRG("field_82339_as");

	/**
	 * <p>
	 * Name: particleTextureIndexX
	 * </p>
	 */
	public static McObfPair field_94054_b = McMappingDatabase.getSRG("field_94054_b");

	/**
	 * <p>
	 * Name: boundingBox
	 * </p>
	 */
	public static McObfPair field_187120_G = McMappingDatabase.getSRG("field_187120_G");

	/**
	 * <p>
	 * Name: setBoundingBox
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/AxisAlignedBB;)V]
	 * </p>
	 */
	public static McObfPair func_187108_a = McMappingDatabase.getSRG("Particle.func_187108_a");

	/**
	 * <p>
	 * Name: interpPosY
	 * </p>
	 */
	public static McObfPair field_70554_ao = McMappingDatabase.getSRG("field_70554_ao");

	/**
	 * <p>
	 * Name: multipleParticleScaleBy
	 * </p>
	 * <p>
	 * Desc: [(F)Lnet/minecraft/client/particle/Particle;]
	 * </p>
	 */
	public static McObfPair func_70541_f = McMappingDatabase.getSRG("Particle.func_70541_f");

	/**
	 * <p>
	 * Name: particleBlue
	 * </p>
	 */
	public static McObfPair field_70551_j = McMappingDatabase.getSRG("field_70551_j");

	/**
	 * <p>
	 * Name: particleMaxAge
	 * </p>
	 */
	public static McObfPair field_70547_e = McMappingDatabase.getSRG("field_70547_e");

	/**
	 * <p>
	 * Name: particleAge
	 * </p>
	 */
	public static McObfPair field_70546_d = McMappingDatabase.getSRG("field_70546_d");

	/**
	 * <p>
	 * Name: particleGravity
	 * </p>
	 */
	public static McObfPair field_70545_g = McMappingDatabase.getSRG("field_70545_g");

	/**
	 * <p>
	 * Name: motionZ
	 * </p>
	 */
	public static McObfPair field_187131_k = McMappingDatabase.getSRG("field_187131_k");

	/**
	 * <p>
	 * Name: move
	 * </p>
	 * <p>
	 * Desc: [(DDD)V]
	 * </p>
	 */
	public static McObfPair func_187110_a = McMappingDatabase.getSRG("Particle.func_187110_a");

	/**
	 * <p>
	 * Name: posZ
	 * </p>
	 */
	public static McObfPair field_187128_h = McMappingDatabase.getSRG("field_187128_h");

	/**
	 * <p>
	 * Name: renderParticle
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/BufferBuilder;Lnet/minecraft/entity/Entity;FFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_180434_a = McMappingDatabase.getSRG("Particle.func_180434_a");

	/**
	 * <p>
	 * Name: onGround
	 * </p>
	 */
	public static McObfPair field_187132_l = McMappingDatabase.getSRG("field_187132_l");

	/**
	 * <p>
	 * Name: multiplyVelocity
	 * </p>
	 * <p>
	 * Desc: [(F)Lnet/minecraft/client/particle/Particle;]
	 * </p>
	 */
	public static McObfPair func_70543_e = McMappingDatabase.getSRG("Particle.func_70543_e");

	/**
	 * <p>
	 * Name: getGreenColorF
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_70542_f = McMappingDatabase.getSRG("Particle.func_70542_f");

	/**
	 * <p>
	 * Name: posX
	 * </p>
	 */
	public static McObfPair field_187126_f = McMappingDatabase.getSRG("field_187126_f");

}
