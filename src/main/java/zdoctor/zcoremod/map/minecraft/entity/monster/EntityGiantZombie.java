package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityGiantZombie {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "acz";
		else
			return "net/minecraft/entity/monster/EntityGiantZombie";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "acz";
		else
			return "EntityGiantZombie";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lacz;";
		else
			return "Lnet/minecraft/entity/monster/EntityGiantZombie;";
	}

	/**
	 * <p>
	 * Name: applyEntityAttributes
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_110147_ax = McMappingDatabase.getSRG("EntityGiantZombie.func_110147_ax");

	/**
	 * <p>
	 * Name: registerFixesGiantZombie
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_189765_b = McMappingDatabase.getSRG("EntityGiantZombie.func_189765_b");

	/**
	 * <p>
	 * Name: getLootTable
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_184647_J = McMappingDatabase.getSRG("EntityGiantZombie.func_184647_J");

	/**
	 * <p>
	 * Name: getBlockPathWeight
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)F]
	 * </p>
	 */
	public static McObfPair func_180484_a = McMappingDatabase.getSRG("EntityGiantZombie.func_180484_a");

	/**
	 * <p>
	 * Name: getEyeHeight
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_70047_e = McMappingDatabase.getSRG("EntityGiantZombie.func_70047_e");

}
