package zdoctor.zcoremod.map.minecraft.entity.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityExpBottle {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aey";
		else
			return "net/minecraft/entity/item/EntityExpBottle";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aey";
		else
			return "EntityExpBottle";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laey;";
		else
			return "Lnet/minecraft/entity/item/EntityExpBottle;";
	}

	/**
	 * <p>
	 * Name: onImpact
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/RayTraceResult;)V]
	 * </p>
	 */
	public static McObfPair func_70184_a = McMappingDatabase.getSRG("EntityExpBottle.func_70184_a");

	/**
	 * <p>
	 * Name: getGravityVelocity
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_70185_h = McMappingDatabase.getSRG("EntityExpBottle.func_70185_h");

	/**
	 * <p>
	 * Name: registerFixesExpBottle
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_189666_a = McMappingDatabase.getSRG("EntityExpBottle.func_189666_a");

}
