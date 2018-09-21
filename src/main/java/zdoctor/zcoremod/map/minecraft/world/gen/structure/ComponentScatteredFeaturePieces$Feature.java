package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ComponentScatteredFeaturePieces$Feature {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbr$d";
		else
			return "net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$Feature";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbr$d";
		else
			return "ComponentScatteredFeaturePieces$Feature";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbbr$d;";
		else
			return "Lnet/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$Feature;";
	}

	/**
	 * <p>
	 * Name: height
	 * </p>
	 */
	public static McObfPair field_74937_b = McMappingDatabase.getSRG("field_74937_b");

	/**
	 * <p>
	 * Name: width
	 * </p>
	 */
	public static McObfPair field_74939_a = McMappingDatabase.getSRG("field_74939_a");

	/**
	 * <p>
	 * Name: horizontalPos
	 * </p>
	 */
	public static McObfPair field_74936_d = McMappingDatabase.getSRG("field_74936_d");

	/**
	 * <p>
	 * Name: depth
	 * </p>
	 */
	public static McObfPair field_74938_c = McMappingDatabase.getSRG("field_74938_c");

	/**
	 * <p>
	 * Name: offsetToAverageGroundLevel
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/world/gen/structure/StructureBoundingBox;I)Z]
	 * </p>
	 */
	public static McObfPair func_74935_a = McMappingDatabase.getSRG("ComponentScatteredFeaturePieces$Feature.func_74935_a");

	/**
	 * <p>
	 * Name: readStructureFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;Lnet/minecraft/world/gen/structure/template/TemplateManager;)V]
	 * </p>
	 */
	public static McObfPair func_143011_b = McMappingDatabase.getSRG("ComponentScatteredFeaturePieces$Feature.func_143011_b");

	/**
	 * <p>
	 * Name: writeStructureToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_143012_a = McMappingDatabase.getSRG("ComponentScatteredFeaturePieces$Feature.func_143012_a");

}
