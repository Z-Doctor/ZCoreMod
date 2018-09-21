package zdoctor.zcoremod.map.minecraft.tileentity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TileEntityDropper {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "avq";
		else
			return "net/minecraft/tileentity/TileEntityDropper";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "avq";
		else
			return "TileEntityDropper";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lavq;";
		else
			return "Lnet/minecraft/tileentity/TileEntityDropper;";
	}

	/**
	 * <p>
	 * Name: getGuiID
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_174875_k = McMappingDatabase.getSRG("TileEntityDropper.func_174875_k");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_70005_c_ = McMappingDatabase.getSRG("TileEntityDropper.func_70005_c_");

	/**
	 * <p>
	 * Name: registerFixesDropper
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_189679_b = McMappingDatabase.getSRG("TileEntityDropper.func_189679_b");

}
