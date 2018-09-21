package zdoctor.zcoremod.map.minecraft.block.state.pattern;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockMaterialMatcher {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "axa";
		else
			return "net/minecraft/block/state/pattern/BlockMaterialMatcher";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "axa";
		else
			return "BlockMaterialMatcher";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laxa;";
		else
			return "Lnet/minecraft/block/state/pattern/BlockMaterialMatcher;";
	}

	/**
	 * <p>
	 * Name: forMaterial
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/material/Material;)Lnet/minecraft/block/state/pattern/BlockMaterialMatcher;]
	 * </p>
	 */
	public static McObfPair func_189886_a = McMappingDatabase.getSRG("BlockMaterialMatcher.func_189886_a");

	/**
	 * <p>
	 * Name: material
	 * </p>
	 */
	public static McObfPair field_189887_a = McMappingDatabase.getSRG("field_189887_a");

}
