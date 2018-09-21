package zdoctor.zcoremod.map.minecraft.client.renderer.block.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemModelGenerator$Span {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvy$a";
		else
			return "net/minecraft/client/renderer/block/model/ItemModelGenerator$Span";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvy$a";
		else
			return "ItemModelGenerator$Span";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbvy$a;";
		else
			return "Lnet/minecraft/client/renderer/block/model/ItemModelGenerator$Span;";
	}

	/**
	 * <p>
	 * Name: spanFacing
	 * </p>
	 */
	public static McObfPair field_178389_a = McMappingDatabase.getSRG("field_178389_a");

	/**
	 * <p>
	 * Name: getFacing
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/renderer/block/model/ItemModelGenerator$SpanFacing;]
	 * </p>
	 */
	public static McObfPair func_178383_a = McMappingDatabase.getSRG("ItemModelGenerator$Span.func_178383_a");

	/**
	 * <p>
	 * Name: anchor
	 * </p>
	 */
	public static McObfPair field_178386_d = McMappingDatabase.getSRG("field_178386_d");

	/**
	 * <p>
	 * Name: getAnchor
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_178381_d = McMappingDatabase.getSRG("ItemModelGenerator$Span.func_178381_d");

	/**
	 * <p>
	 * Name: getMin
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_178385_b = McMappingDatabase.getSRG("ItemModelGenerator$Span.func_178385_b");

	/**
	 * <p>
	 * Name: getMax
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_178384_c = McMappingDatabase.getSRG("ItemModelGenerator$Span.func_178384_c");

	/**
	 * <p>
	 * Name: max
	 * </p>
	 */
	public static McObfPair field_178388_c = McMappingDatabase.getSRG("field_178388_c");

	/**
	 * <p>
	 * Name: min
	 * </p>
	 */
	public static McObfPair field_178387_b = McMappingDatabase.getSRG("field_178387_b");

	/**
	 * <p>
	 * Name: expand
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_178382_a = McMappingDatabase.getSRG("ItemModelGenerator$Span.func_178382_a");

}
