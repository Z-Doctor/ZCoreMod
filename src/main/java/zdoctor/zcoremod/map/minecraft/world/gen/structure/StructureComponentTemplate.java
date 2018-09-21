package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class StructureComponentTemplate {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbz";
		else
			return "net/minecraft/world/gen/structure/StructureComponentTemplate";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbz";
		else
			return "StructureComponentTemplate";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbbz;";
		else
			return "Lnet/minecraft/world/gen/structure/StructureComponentTemplate;";
	}

	/**
	 * <p>
	 * Name: placeSettings
	 * </p>
	 */
	public static McObfPair field_186177_b = McMappingDatabase.getSRG("field_186177_b");

	/**
	 * <p>
	 * Name: setup
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/gen/structure/template/Template;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/world/gen/structure/template/PlacementSettings;)V]
	 * </p>
	 */
	public static McObfPair func_186173_a = McMappingDatabase.getSRG("StructureComponentTemplate.func_186173_a");

	/**
	 * <p>
	 * Name: handleDataMarker
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)V]
	 * </p>
	 */
	public static McObfPair func_186175_a = McMappingDatabase.getSRG("StructureComponentTemplate.func_186175_a");

	/**
	 * <p>
	 * Name: DEFAULT_PLACE_SETTINGS
	 * </p>
	 */
	public static McObfPair field_186179_d = McMappingDatabase.getSRG("field_186179_d");

	/**
	 * <p>
	 * Name: addComponentParts
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)Z]
	 * </p>
	 */
	public static McObfPair func_74875_a = McMappingDatabase.getSRG("StructureComponentTemplate.func_74875_a");

	/**
	 * <p>
	 * Name: templatePosition
	 * </p>
	 */
	public static McObfPair field_186178_c = McMappingDatabase.getSRG("field_186178_c");

	/**
	 * <p>
	 * Name: offset
	 * </p>
	 * <p>
	 * Desc: [(III)V]
	 * </p>
	 */
	public static McObfPair func_181138_a = McMappingDatabase.getSRG("StructureComponentTemplate.func_181138_a");

	/**
	 * <p>
	 * Name: readStructureFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;Lnet/minecraft/world/gen/structure/template/TemplateManager;)V]
	 * </p>
	 */
	public static McObfPair func_143011_b = McMappingDatabase.getSRG("StructureComponentTemplate.func_143011_b");

	/**
	 * <p>
	 * Name: writeStructureToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_143012_a = McMappingDatabase.getSRG("StructureComponentTemplate.func_143012_a");

	/**
	 * <p>
	 * Name: template
	 * </p>
	 */
	public static McObfPair field_186176_a = McMappingDatabase.getSRG("field_186176_a");

	/**
	 * <p>
	 * Name: setBoundingBoxFromTemplate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_186174_h = McMappingDatabase.getSRG("StructureComponentTemplate.func_186174_h");

}
