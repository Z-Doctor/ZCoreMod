package zdoctor.zcoremod.map.minecraft.world.gen.structure.template;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Template$BasicPalette {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bcj$a";
		else
			return "net/minecraft/world/gen/structure/template/Template$BasicPalette";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bcj$a";
		else
			return "Template$BasicPalette";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbcj$a;";
		else
			return "Lnet/minecraft/world/gen/structure/template/Template$BasicPalette;";
	}

	/**
	 * <p>
	 * Name: stateFor
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_189955_a = McMappingDatabase.getSRG("Template$BasicPalette.func_189955_a");

	/**
	 * <p>
	 * Name: DEFAULT_BLOCK_STATE
	 * </p>
	 */
	public static McObfPair field_189957_a = McMappingDatabase.getSRG("field_189957_a");

	/**
	 * <p>
	 * Name: ids
	 * </p>
	 */
	public static McObfPair field_189958_b = McMappingDatabase.getSRG("field_189958_b");

	/**
	 * <p>
	 * Name: addMapping
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;I)V]
	 * </p>
	 */
	public static McObfPair func_189956_a = McMappingDatabase.getSRG("Template$BasicPalette.func_189956_a");

	/**
	 * <p>
	 * Name: idFor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)I]
	 * </p>
	 */
	public static McObfPair func_189954_a = McMappingDatabase.getSRG("Template$BasicPalette.func_189954_a");

	/**
	 * <p>
	 * Name: lastId
	 * </p>
	 */
	public static McObfPair field_189959_c = McMappingDatabase.getSRG("field_189959_c");

}
