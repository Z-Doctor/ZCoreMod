package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GlStateManager$Profile {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bus$q";
		else
			return "net/minecraft/client/renderer/GlStateManager$Profile";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bus$q";
		else
			return "GlStateManager$Profile";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbus$q;";
		else
			return "Lnet/minecraft/client/renderer/GlStateManager$Profile;";
	}

	/**
	 * <p>
	 * Name: clean
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_187374_b = McMappingDatabase.getSRG("GlStateManager$Profile.func_187374_b");

	/**
	 * <p>
	 * Name: apply
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_187373_a = McMappingDatabase.getSRG("GlStateManager$Profile.func_187373_a");

}
