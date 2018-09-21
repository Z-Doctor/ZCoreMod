package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ComponentScatteredFeaturePieces$Igloo {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbr$b";
		else
			return "net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$Igloo";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbr$b";
		else
			return "ComponentScatteredFeaturePieces$Igloo";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbbr$b;";
		else
			return "Lnet/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$Igloo;";
	}

	/**
	 * <p>
	 * Name: IGLOO_BOTTOM_ID
	 * </p>
	 */
	public static McObfPair field_186172_g = McMappingDatabase.getSRG("field_186172_g");

	/**
	 * <p>
	 * Name: IGLOO_TOP_ID
	 * </p>
	 */
	public static McObfPair field_186170_e = McMappingDatabase.getSRG("field_186170_e");

	/**
	 * <p>
	 * Name: IGLOO_MIDDLE_ID
	 * </p>
	 */
	public static McObfPair field_186171_f = McMappingDatabase.getSRG("field_186171_f");

	/**
	 * <p>
	 * Name: addComponentParts
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)Z]
	 * </p>
	 */
	public static McObfPair func_74875_a = McMappingDatabase.getSRG("ComponentScatteredFeaturePieces$Igloo.func_74875_a");

}
