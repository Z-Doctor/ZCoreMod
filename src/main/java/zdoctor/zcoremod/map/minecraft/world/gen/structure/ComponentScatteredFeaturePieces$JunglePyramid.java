package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ComponentScatteredFeaturePieces$JunglePyramid {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbr$c";
		else
			return "net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbr$c";
		else
			return "ComponentScatteredFeaturePieces$JunglePyramid";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbbr$c;";
		else
			return "Lnet/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$JunglePyramid;";
	}

	/**
	 * <p>
	 * Name: addComponentParts
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)Z]
	 * </p>
	 */
	public static McObfPair func_74875_a = McMappingDatabase.getSRG("ComponentScatteredFeaturePieces$JunglePyramid.func_74875_a");

	/**
	 * <p>
	 * Name: cobblestoneSelector
	 * </p>
	 */
	public static McObfPair field_74942_n = McMappingDatabase.getSRG("field_74942_n");

	/**
	 * <p>
	 * Name: placedTrap2
	 * </p>
	 */
	public static McObfPair field_74946_k = McMappingDatabase.getSRG("field_74946_k");

	/**
	 * <p>
	 * Name: placedTrap1
	 * </p>
	 */
	public static McObfPair field_74945_j = McMappingDatabase.getSRG("field_74945_j");

	/**
	 * <p>
	 * Name: readStructureFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;Lnet/minecraft/world/gen/structure/template/TemplateManager;)V]
	 * </p>
	 */
	public static McObfPair func_143011_b = McMappingDatabase.getSRG("ComponentScatteredFeaturePieces$JunglePyramid.func_143011_b");

	/**
	 * <p>
	 * Name: placedHiddenChest
	 * </p>
	 */
	public static McObfPair field_74948_i = McMappingDatabase.getSRG("field_74948_i");

	/**
	 * <p>
	 * Name: writeStructureToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_143012_a = McMappingDatabase.getSRG("ComponentScatteredFeaturePieces$JunglePyramid.func_143012_a");

	/**
	 * <p>
	 * Name: placedMainChest
	 * </p>
	 */
	public static McObfPair field_74947_h = McMappingDatabase.getSRG("field_74947_h");

}
