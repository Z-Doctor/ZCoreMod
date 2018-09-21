package zdoctor.zcoremod.map.minecraft.client.renderer.block.statemap;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class StateMap$Builder {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bwr$a";
		else
			return "net/minecraft/client/renderer/block/statemap/StateMap$Builder";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bwr$a";
		else
			return "StateMap$Builder";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbwr$a;";
		else
			return "Lnet/minecraft/client/renderer/block/statemap/StateMap$Builder;";
	}

	/**
	 * <p>
	 * Name: suffix
	 * </p>
	 */
	public static McObfPair field_178443_b = McMappingDatabase.getSRG("field_178443_b");

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_178445_a = McMappingDatabase.getSRG("field_178445_a");

	/**
	 * <p>
	 * Name: withName
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/properties/IProperty;)Lnet/minecraft/client/renderer/block/statemap/StateMap$Builder;]
	 * </p>
	 */
	public static McObfPair func_178440_a = McMappingDatabase.getSRG("StateMap$Builder.func_178440_a");

	/**
	 * <p>
	 * Name: ignored
	 * </p>
	 */
	public static McObfPair field_178444_c = McMappingDatabase.getSRG("field_178444_c");

	/**
	 * <p>
	 * Name: build
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/renderer/block/statemap/StateMap;]
	 * </p>
	 */
	public static McObfPair func_178441_a = McMappingDatabase.getSRG("StateMap$Builder.func_178441_a");

	/**
	 * <p>
	 * Name: withSuffix
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/client/renderer/block/statemap/StateMap$Builder;]
	 * </p>
	 */
	public static McObfPair func_178439_a = McMappingDatabase.getSRG("StateMap$Builder.func_178439_a");

	/**
	 * <p>
	 * Name: ignore
	 * </p>
	 * <p>
	 * Desc: [([Lnet/minecraft/block/properties/IProperty;)Lnet/minecraft/client/renderer/block/statemap/StateMap$Builder;]
	 * </p>
	 */
	public static McObfPair func_178442_a = McMappingDatabase.getSRG("StateMap$Builder.func_178442_a");

}
