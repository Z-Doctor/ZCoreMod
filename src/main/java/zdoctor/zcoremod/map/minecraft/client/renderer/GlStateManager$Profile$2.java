package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GlStateManager$Profile$2 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bus$q$2";
		else
			return "net/minecraft/client/renderer/GlStateManager$Profile$2";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bus$q$2";
		else
			return "GlStateManager$Profile$2";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbus$q$2;";
		else
			return "Lnet/minecraft/client/renderer/GlStateManager$Profile$2;";
	}

	/**
	 * <p>
	 * Name: clean
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_187374_b = McMappingDatabase.getSRG("GlStateManager$Profile$2.func_187374_b");

	/**
	 * <p>
	 * Name: apply
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_187373_a = McMappingDatabase.getSRG("GlStateManager$Profile$2.func_187373_a");

}
