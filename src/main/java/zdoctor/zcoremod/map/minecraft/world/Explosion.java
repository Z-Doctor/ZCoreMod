package zdoctor.zcoremod.map.minecraft.world;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Explosion {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "amp";
		else
			return "net/minecraft/world/Explosion";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "amp";
		else
			return "Explosion";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lamp;";
		else
			return "Lnet/minecraft/world/Explosion;";
	}

	/**
	 * <p>
	 * Name: playerKnockbackMap
	 * </p>
	 */
	public static McObfPair field_77288_k = McMappingDatabase.getSRG("field_77288_k");

	/**
	 * <p>
	 * Name: doExplosionB
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_77279_a = McMappingDatabase.getSRG("Explosion.func_77279_a");

	/**
	 * <p>
	 * Name: y
	 * </p>
	 */
	public static McObfPair field_77285_c = McMappingDatabase.getSRG("field_77285_c");

	/**
	 * <p>
	 * Name: random
	 * </p>
	 */
	public static McObfPair field_77290_i = McMappingDatabase.getSRG("field_77290_i");

	/**
	 * <p>
	 * Name: z
	 * </p>
	 */
	public static McObfPair field_77282_d = McMappingDatabase.getSRG("field_77282_d");

	/**
	 * <p>
	 * Name: size
	 * </p>
	 */
	public static McObfPair field_77280_f = McMappingDatabase.getSRG("field_77280_f");

	/**
	 * <p>
	 * Name: causesFire
	 * </p>
	 */
	public static McObfPair field_77286_a = McMappingDatabase.getSRG("field_77286_a");

	/**
	 * <p>
	 * Name: doExplosionA
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_77278_a = McMappingDatabase.getSRG("Explosion.func_77278_a");

	/**
	 * <p>
	 * Name: exploder
	 * </p>
	 */
	public static McObfPair field_77283_e = McMappingDatabase.getSRG("field_77283_e");

	/**
	 * <p>
	 * Name: affectedBlockPositions
	 * </p>
	 */
	public static McObfPair field_77281_g = McMappingDatabase.getSRG("field_77281_g");

	/**
	 * <p>
	 * Name: getPlayerKnockbackMap
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Map;]
	 * </p>
	 */
	public static McObfPair func_77277_b = McMappingDatabase.getSRG("Explosion.func_77277_b");

	/**
	 * <p>
	 * Name: world
	 * </p>
	 */
	public static McObfPair field_77287_j = McMappingDatabase.getSRG("field_77287_j");

	/**
	 * <p>
	 * Name: x
	 * </p>
	 */
	public static McObfPair field_77284_b = McMappingDatabase.getSRG("field_77284_b");

	/**
	 * <p>
	 * Name: getAffectedBlockPositions
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_180343_e = McMappingDatabase.getSRG("Explosion.func_180343_e");

	/**
	 * <p>
	 * Name: clearAffectedBlockPositions
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_180342_d = McMappingDatabase.getSRG("Explosion.func_180342_d");

	/**
	 * <p>
	 * Name: damagesTerrain
	 * </p>
	 */
	public static McObfPair field_82755_b = McMappingDatabase.getSRG("field_82755_b");

	/**
	 * <p>
	 * Name: getExplosivePlacedBy
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/EntityLivingBase;]
	 * </p>
	 */
	public static McObfPair func_94613_c = McMappingDatabase.getSRG("Explosion.func_94613_c");

}
