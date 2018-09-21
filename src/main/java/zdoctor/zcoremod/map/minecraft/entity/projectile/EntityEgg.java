package zdoctor.zcoremod.map.minecraft.entity.projectile;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityEgg {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aew";
		else
			return "net/minecraft/entity/projectile/EntityEgg";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aew";
		else
			return "EntityEgg";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laew;";
		else
			return "Lnet/minecraft/entity/projectile/EntityEgg;";
	}

	/**
	 * <p>
	 * Name: handleStatusUpdate
	 * </p>
	 * <p>
	 * Desc: [(B)V]
	 * </p>
	 */
	public static McObfPair func_70103_a = McMappingDatabase.getSRG("EntityEgg.func_70103_a");

	/**
	 * <p>
	 * Name: registerFixesEgg
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_189664_a = McMappingDatabase.getSRG("EntityEgg.func_189664_a");

	/**
	 * <p>
	 * Name: onImpact
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/RayTraceResult;)V]
	 * </p>
	 */
	public static McObfPair func_70184_a = McMappingDatabase.getSRG("EntityEgg.func_70184_a");

}
