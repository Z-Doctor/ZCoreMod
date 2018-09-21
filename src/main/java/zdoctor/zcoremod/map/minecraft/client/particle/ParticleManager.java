package zdoctor.zcoremod.map.minecraft.client.particle;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ParticleManager {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "btg";
		else
			return "net/minecraft/client/particle/ParticleManager";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "btg";
		else
			return "ParticleManager";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbtg;";
		else
			return "Lnet/minecraft/client/particle/ParticleManager;";
	}

	/**
	 * <p>
	 * Name: renderer
	 * </p>
	 */
	public static McObfPair field_78877_c = McMappingDatabase.getSRG("field_78877_c");

	/**
	 * <p>
	 * Name: particleTypes
	 * </p>
	 */
	public static McObfPair field_178932_g = McMappingDatabase.getSRG("field_178932_g");

	/**
	 * <p>
	 * Name: particleEmitters
	 * </p>
	 */
	public static McObfPair field_178933_d = McMappingDatabase.getSRG("field_178933_d");

	/**
	 * <p>
	 * Name: renderLitParticles
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;F)V]
	 * </p>
	 */
	public static McObfPair func_78872_b = McMappingDatabase.getSRG("ParticleManager.func_78872_b");

	/**
	 * <p>
	 * Name: rand
	 * </p>
	 */
	public static McObfPair field_78875_d = McMappingDatabase.getSRG("field_78875_d");

	/**
	 * <p>
	 * Name: renderParticles
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;F)V]
	 * </p>
	 */
	public static McObfPair func_78874_a = McMappingDatabase.getSRG("ParticleManager.func_78874_a");

	/**
	 * <p>
	 * Name: PARTICLE_TEXTURES
	 * </p>
	 */
	public static McObfPair field_110737_b = McMappingDatabase.getSRG("field_110737_b");

	/**
	 * <p>
	 * Name: updateEffects
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_78868_a = McMappingDatabase.getSRG("ParticleManager.func_78868_a");

	/**
	 * <p>
	 * Name: addBlockHitEffects
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)V]
	 * </p>
	 */
	public static McObfPair func_180532_a = McMappingDatabase.getSRG("ParticleManager.func_180532_a");

	/**
	 * <p>
	 * Name: tickParticle
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/particle/Particle;)V]
	 * </p>
	 */
	public static McObfPair func_178923_d = McMappingDatabase.getSRG("ParticleManager.func_178923_d");

	/**
	 * <p>
	 * Name: clearEffects
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;)V]
	 * </p>
	 */
	public static McObfPair func_78870_a = McMappingDatabase.getSRG("ParticleManager.func_78870_a");

	/**
	 * <p>
	 * Name: tickParticleList
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Queue;)V]
	 * </p>
	 */
	public static McObfPair func_187240_a = McMappingDatabase.getSRG("ParticleManager.func_187240_a");

	/**
	 * <p>
	 * Name: queue
	 * </p>
	 */
	public static McObfPair field_187241_h = McMappingDatabase.getSRG("field_187241_h");

	/**
	 * <p>
	 * Name: registerParticle
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/client/particle/IParticleFactory;)V]
	 * </p>
	 */
	public static McObfPair func_178929_a = McMappingDatabase.getSRG("ParticleManager.func_178929_a");

	/**
	 * <p>
	 * Name: spawnEffectParticle
	 * </p>
	 * <p>
	 * Desc: [(IDDDDDD[I)Lnet/minecraft/client/particle/Particle;]
	 * </p>
	 */
	public static McObfPair func_178927_a = McMappingDatabase.getSRG("ParticleManager.func_178927_a");

	/**
	 * <p>
	 * Name: addBlockDestroyEffects
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)V]
	 * </p>
	 */
	public static McObfPair func_180533_a = McMappingDatabase.getSRG("ParticleManager.func_180533_a");

	/**
	 * <p>
	 * Name: world
	 * </p>
	 */
	public static McObfPair field_78878_a = McMappingDatabase.getSRG("field_78878_a");

	/**
	 * <p>
	 * Name: getStatistics
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_78869_b = McMappingDatabase.getSRG("ParticleManager.func_78869_b");

	/**
	 * <p>
	 * Name: registerVanillaParticles
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_178930_c = McMappingDatabase.getSRG("ParticleManager.func_178930_c");

	/**
	 * <p>
	 * Name: fxLayers
	 * </p>
	 */
	public static McObfPair field_78876_b = McMappingDatabase.getSRG("field_78876_b");

	/**
	 * <p>
	 * Name: updateEffectLayer
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_178922_a = McMappingDatabase.getSRG("ParticleManager.func_178922_a");

	/**
	 * <p>
	 * Name: emitParticleAtEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;Lnet/minecraft/util/EnumParticleTypes;)V]
	 * </p>
	 */
	public static McObfPair func_178926_a = McMappingDatabase.getSRG("ParticleManager.func_178926_a");

	/**
	 * <p>
	 * Name: emitParticleAtEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;Lnet/minecraft/util/EnumParticleTypes;I)V]
	 * </p>
	 */
	public static McObfPair func_191271_a = McMappingDatabase.getSRG("ParticleManager.func_191271_a");

	/**
	 * <p>
	 * Name: addEffect
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/particle/Particle;)V]
	 * </p>
	 */
	public static McObfPair func_78873_a = McMappingDatabase.getSRG("ParticleManager.func_78873_a");

}
