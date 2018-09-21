package zdoctor.zcoremod.map.minecraft.block.state;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockStateBase$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "awp$1";
		else
			return "net/minecraft/block/state/BlockStateBase$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "awp$1";
		else
			return "BlockStateBase$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lawp$1;";
		else
			return "Lnet/minecraft/block/state/BlockStateBase$1;";
	}

	/**
	 * <p>
	 * Name: getPropertyName
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/properties/IProperty;Ljava/lang/Comparable;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_185886_a = McMappingDatabase.getSRG("BlockStateBase$1.func_185886_a");

}
