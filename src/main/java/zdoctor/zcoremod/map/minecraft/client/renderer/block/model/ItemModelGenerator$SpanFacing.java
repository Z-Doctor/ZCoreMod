package zdoctor.zcoremod.map.minecraft.client.renderer.block.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemModelGenerator$SpanFacing {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvy$b";
		else
			return "net/minecraft/client/renderer/block/model/ItemModelGenerator$SpanFacing";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvy$b";
		else
			return "ItemModelGenerator$SpanFacing";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbvy$b;";
		else
			return "Lnet/minecraft/client/renderer/block/model/ItemModelGenerator$SpanFacing;";
	}

	/**
	 * <p>
	 * Name: isHorizontal
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_178369_d = McMappingDatabase.getSRG("ItemModelGenerator$SpanFacing.func_178369_d");

	/**
	 * <p>
	 * Name: yOffset
	 * </p>
	 */
	public static McObfPair field_178374_g = McMappingDatabase.getSRG("field_178374_g");

	/**
	 * <p>
	 * Name: getYOffset
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_178371_c = McMappingDatabase.getSRG("ItemModelGenerator$SpanFacing.func_178371_c");

	/**
	 * <p>
	 * Name: getXOffset
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_178372_b = McMappingDatabase.getSRG("ItemModelGenerator$SpanFacing.func_178372_b");

	/**
	 * <p>
	 * Name: getFacing
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/EnumFacing;]
	 * </p>
	 */
	public static McObfPair func_178367_a = McMappingDatabase.getSRG("ItemModelGenerator$SpanFacing.func_178367_a");

	/**
	 * <p>
	 * Name: xOffset
	 * </p>
	 */
	public static McObfPair field_178373_f = McMappingDatabase.getSRG("field_178373_f");

	/**
	 * <p>
	 * Name: facing
	 * </p>
	 */
	public static McObfPair field_178376_e = McMappingDatabase.getSRG("field_178376_e");

}
