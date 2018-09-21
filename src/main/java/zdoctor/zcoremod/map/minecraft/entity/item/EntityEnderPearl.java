package zdoctor.zcoremod.map.minecraft.entity.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityEnderPearl {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aex";
		else
			return "net/minecraft/entity/item/EntityEnderPearl";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aex";
		else
			return "EntityEnderPearl";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laex;";
		else
			return "Lnet/minecraft/entity/item/EntityEnderPearl;";
	}

	/**
	 * <p>
	 * Name: registerFixesEnderPearl
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_189663_a = McMappingDatabase.getSRG("EntityEnderPearl.func_189663_a");

	/**
	 * <p>
	 * Name: changeDimension
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/entity/Entity;]
	 * </p>
	 */
	public static McObfPair func_184204_a = McMappingDatabase.getSRG("EntityEnderPearl.func_184204_a");

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70071_h_ = McMappingDatabase.getSRG("EntityEnderPearl.func_70071_h_");

	/**
	 * <p>
	 * Name: perlThrower
	 * </p>
	 */
	public static McObfPair field_181555_c = McMappingDatabase.getSRG("field_181555_c");

	/**
	 * <p>
	 * Name: onImpact
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/RayTraceResult;)V]
	 * </p>
	 */
	public static McObfPair func_70184_a = McMappingDatabase.getSRG("EntityEnderPearl.func_70184_a");

}
