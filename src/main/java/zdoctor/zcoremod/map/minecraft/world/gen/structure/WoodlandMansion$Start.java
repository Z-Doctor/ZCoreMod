package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WoodlandMansion$Start {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bcc$a";
		else
			return "net/minecraft/world/gen/structure/WoodlandMansion$Start";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bcc$a";
		else
			return "WoodlandMansion$Start";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbcc$a;";
		else
			return "Lnet/minecraft/world/gen/structure/WoodlandMansion$Start;";
	}

	/**
	 * <p>
	 * Name: generateStructure
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)V]
	 * </p>
	 */
	public static McObfPair func_75068_a = McMappingDatabase.getSRG("WoodlandMansion$Start.func_75068_a");

	/**
	 * <p>
	 * Name: isSizeableStructure
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75069_d = McMappingDatabase.getSRG("WoodlandMansion$Start.func_75069_d");

	/**
	 * <p>
	 * Name: isValid
	 * </p>
	 */
	public static McObfPair field_191093_c = McMappingDatabase.getSRG("field_191093_c");

	/**
	 * <p>
	 * Name: create
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/world/gen/ChunkGeneratorOverworld;Ljava/util/Random;II)V]
	 * </p>
	 */
	public static McObfPair func_191092_a = McMappingDatabase.getSRG("WoodlandMansion$Start.func_191092_a");

}
