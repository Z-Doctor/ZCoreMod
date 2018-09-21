package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class StructureVillagePieces$PieceWeight {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bcb$e";
		else
			return "net/minecraft/world/gen/structure/StructureVillagePieces$PieceWeight";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bcb$e";
		else
			return "StructureVillagePieces$PieceWeight";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbcb$e;";
		else
			return "Lnet/minecraft/world/gen/structure/StructureVillagePieces$PieceWeight;";
	}

	/**
	 * <p>
	 * Name: canSpawnMoreVillagePieces
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75086_a = McMappingDatabase.getSRG("StructureVillagePieces$PieceWeight.func_75086_a");

	/**
	 * <p>
	 * Name: villagePiecesLimit
	 * </p>
	 */
	public static McObfPair field_75087_d = McMappingDatabase.getSRG("field_75087_d");

	/**
	 * <p>
	 * Name: canSpawnMoreVillagePiecesOfType
	 * </p>
	 * <p>
	 * Desc: [(I)Z]
	 * </p>
	 */
	public static McObfPair func_75085_a = McMappingDatabase.getSRG("StructureVillagePieces$PieceWeight.func_75085_a");

	/**
	 * <p>
	 * Name: villagePiecesSpawned
	 * </p>
	 */
	public static McObfPair field_75089_c = McMappingDatabase.getSRG("field_75089_c");

	/**
	 * <p>
	 * Name: villagePieceClass
	 * </p>
	 */
	public static McObfPair field_75090_a = McMappingDatabase.getSRG("field_75090_a");

	/**
	 * <p>
	 * Name: villagePieceWeight
	 * </p>
	 */
	public static McObfPair field_75088_b = McMappingDatabase.getSRG("field_75088_b");

}
