package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ComponentScatteredFeaturePieces {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbr";
		else
			return "net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbr";
		else
			return "ComponentScatteredFeaturePieces";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbbr;";
		else
			return "Lnet/minecraft/world/gen/structure/ComponentScatteredFeaturePieces;";
	}

	/**
	 * <p>
	 * Name: registerScatteredFeaturePieces
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_143045_a = McMappingDatabase.getSRG("ComponentScatteredFeaturePieces.func_143045_a");

}
