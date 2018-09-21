package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ComponentScatteredFeaturePieces$JunglePyramid$Stones {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbr$c$a";
		else
			return "net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid$Stones";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbr$c$a";
		else
			return "ComponentScatteredFeaturePieces$JunglePyramid$Stones";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbbr$c$a;";
		else
			return "Lnet/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid$Stones;";
	}

	/**
	 * <p>
	 * Name: selectBlocks
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;IIIZ)V]
	 * </p>
	 */
	public static McObfPair func_75062_a = McMappingDatabase.getSRG("ComponentScatteredFeaturePieces$JunglePyramid$Stones.func_75062_a");

}
