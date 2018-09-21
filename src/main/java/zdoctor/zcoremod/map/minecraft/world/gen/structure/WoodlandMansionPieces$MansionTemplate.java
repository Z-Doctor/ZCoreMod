package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WoodlandMansionPieces$MansionTemplate {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bcd$i";
		else
			return "net/minecraft/world/gen/structure/WoodlandMansionPieces$MansionTemplate";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bcd$i";
		else
			return "WoodlandMansionPieces$MansionTemplate";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbcd$i;";
		else
			return "Lnet/minecraft/world/gen/structure/WoodlandMansionPieces$MansionTemplate;";
	}

	/**
	 * <p>
	 * Name: rotation
	 * </p>
	 */
	public static McObfPair field_191083_e = McMappingDatabase.getSRG("field_191083_e");

	/**
	 * <p>
	 * Name: writeStructureToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_143012_a = McMappingDatabase.getSRG("WoodlandMansionPieces$MansionTemplate.func_143012_a");

	/**
	 * <p>
	 * Name: templateName
	 * </p>
	 */
	public static McObfPair field_191082_d = McMappingDatabase.getSRG("field_191082_d");

	/**
	 * <p>
	 * Name: mirror
	 * </p>
	 */
	public static McObfPair field_191084_f = McMappingDatabase.getSRG("field_191084_f");

	/**
	 * <p>
	 * Name: handleDataMarker
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)V]
	 * </p>
	 */
	public static McObfPair func_186175_a = McMappingDatabase.getSRG("WoodlandMansionPieces$MansionTemplate.func_186175_a");

	/**
	 * <p>
	 * Name: readStructureFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;Lnet/minecraft/world/gen/structure/template/TemplateManager;)V]
	 * </p>
	 */
	public static McObfPair func_143011_b = McMappingDatabase.getSRG("WoodlandMansionPieces$MansionTemplate.func_143011_b");

	/**
	 * <p>
	 * Name: loadTemplate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/gen/structure/template/TemplateManager;)V]
	 * </p>
	 */
	public static McObfPair func_191081_a = McMappingDatabase.getSRG("WoodlandMansionPieces$MansionTemplate.func_191081_a");

}
