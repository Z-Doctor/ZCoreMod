package zdoctor.zcoremod.map.minecraft.world.gen.structure.template;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockRotationProcessor {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bcf";
		else
			return "net/minecraft/world/gen/structure/template/BlockRotationProcessor";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bcf";
		else
			return "BlockRotationProcessor";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbcf;";
		else
			return "Lnet/minecraft/world/gen/structure/template/BlockRotationProcessor;";
	}

	/**
	 * <p>
	 * Name: random
	 * </p>
	 */
	public static McObfPair field_189945_b = McMappingDatabase.getSRG("field_189945_b");

	/**
	 * <p>
	 * Name: chance
	 * </p>
	 */
	public static McObfPair field_189944_a = McMappingDatabase.getSRG("field_189944_a");

	/**
	 * <p>
	 * Name: processBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/world/gen/structure/template/Template$BlockInfo;)Lnet/minecraft/world/gen/structure/template/Template$BlockInfo;]
	 * </p>
	 */
	public static McObfPair func_189943_a = McMappingDatabase.getSRG("BlockRotationProcessor.func_189943_a");

}
