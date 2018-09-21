package zdoctor.zcoremod.map.minecraft.client.renderer.chunk;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CompiledChunk {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bxo";
		else
			return "net/minecraft/client/renderer/chunk/CompiledChunk";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bxo";
		else
			return "CompiledChunk";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbxo;";
		else
			return "Lnet/minecraft/client/renderer/chunk/CompiledChunk;";
	}

	/**
	 * <p>
	 * Name: tileEntities
	 * </p>
	 */
	public static McObfPair field_178499_e = McMappingDatabase.getSRG("field_178499_e");

	/**
	 * <p>
	 * Name: setState
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/BufferBuilder$State;)V]
	 * </p>
	 */
	public static McObfPair func_178494_a = McMappingDatabase.getSRG("CompiledChunk.func_178494_a");

	/**
	 * <p>
	 * Name: setVisibility
	 * </p>
	 */
	public static McObfPair field_178496_f = McMappingDatabase.getSRG("field_178496_f");

	/**
	 * <p>
	 * Name: setVisibility
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/chunk/SetVisibility;)V]
	 * </p>
	 */
	public static McObfPair func_178488_a = McMappingDatabase.getSRG("CompiledChunk.func_178488_a");

	/**
	 * <p>
	 * Name: state
	 * </p>
	 */
	public static McObfPair field_178497_g = McMappingDatabase.getSRG("field_178497_g");

	/**
	 * <p>
	 * Name: empty
	 * </p>
	 */
	public static McObfPair field_178498_d = McMappingDatabase.getSRG("field_178498_d");

	/**
	 * <p>
	 * Name: setLayerStarted
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/BlockRenderLayer;)V]
	 * </p>
	 */
	public static McObfPair func_178493_c = McMappingDatabase.getSRG("CompiledChunk.func_178493_c");

	/**
	 * <p>
	 * Name: addTileEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/tileentity/TileEntity;)V]
	 * </p>
	 */
	public static McObfPair func_178490_a = McMappingDatabase.getSRG("CompiledChunk.func_178490_a");

	/**
	 * <p>
	 * Name: isLayerStarted
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/BlockRenderLayer;)Z]
	 * </p>
	 */
	public static McObfPair func_178492_d = McMappingDatabase.getSRG("CompiledChunk.func_178492_d");

	/**
	 * <p>
	 * Name: isVisible
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumFacing;Lnet/minecraft/util/EnumFacing;)Z]
	 * </p>
	 */
	public static McObfPair func_178495_a = McMappingDatabase.getSRG("CompiledChunk.func_178495_a");

	/**
	 * <p>
	 * Name: layersStarted
	 * </p>
	 */
	public static McObfPair field_178501_c = McMappingDatabase.getSRG("field_178501_c");

	/**
	 * <p>
	 * Name: isEmpty
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_178489_a = McMappingDatabase.getSRG("CompiledChunk.func_178489_a");

	/**
	 * <p>
	 * Name: getTileEntities
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_178485_b = McMappingDatabase.getSRG("CompiledChunk.func_178485_b");

	/**
	 * <p>
	 * Name: layersUsed
	 * </p>
	 */
	public static McObfPair field_178500_b = McMappingDatabase.getSRG("field_178500_b");

	/**
	 * <p>
	 * Name: setLayerUsed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/BlockRenderLayer;)V]
	 * </p>
	 */
	public static McObfPair func_178486_a = McMappingDatabase.getSRG("CompiledChunk.func_178486_a");

	/**
	 * <p>
	 * Name: isLayerEmpty
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/BlockRenderLayer;)Z]
	 * </p>
	 */
	public static McObfPair func_178491_b = McMappingDatabase.getSRG("CompiledChunk.func_178491_b");

	/**
	 * <p>
	 * Name: DUMMY
	 * </p>
	 */
	public static McObfPair field_178502_a = McMappingDatabase.getSRG("field_178502_a");

	/**
	 * <p>
	 * Name: getState
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/renderer/BufferBuilder$State;]
	 * </p>
	 */
	public static McObfPair func_178487_c = McMappingDatabase.getSRG("CompiledChunk.func_178487_c");

}
