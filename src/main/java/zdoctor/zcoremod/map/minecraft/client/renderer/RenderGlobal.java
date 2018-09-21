package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderGlobal {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "buy";
		else
			return "net/minecraft/client/renderer/RenderGlobal";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "buy";
		else
			return "RenderGlobal";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbuy;";
		else
			return "Lnet/minecraft/client/renderer/RenderGlobal;";
	}

	/**
	 * <p>
	 * Name: calculateParticleLevel
	 * </p>
	 * <p>
	 * Desc: [(Z)I]
	 * </p>
	 */
	public static McObfPair func_190572_a = McMappingDatabase.getSRG("RenderGlobal.func_190572_a");

	/**
	 * <p>
	 * Name: preRenderDamagedBlocks
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_180443_s = McMappingDatabase.getSRG("RenderGlobal.func_180443_s");

	/**
	 * <p>
	 * Name: renderDistanceChunks
	 * </p>
	 */
	public static McObfPair field_72739_F = McMappingDatabase.getSRG("field_72739_F");

	/**
	 * <p>
	 * Name: frustumUpdatePosChunkX
	 * </p>
	 */
	public static McObfPair field_174988_E = McMappingDatabase.getSRG("field_174988_E");

	/**
	 * <p>
	 * Name: frustumUpdatePosChunkZ
	 * </p>
	 */
	public static McObfPair field_174990_G = McMappingDatabase.getSRG("field_174990_G");

	/**
	 * <p>
	 * Name: playSoundToAllNearExcept
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/SoundEvent;Lnet/minecraft/util/SoundCategory;DDDFF)V]
	 * </p>
	 */
	public static McObfPair func_184375_a = McMappingDatabase.getSRG("RenderGlobal.func_184375_a");

	/**
	 * <p>
	 * Name: spawnParticle0
	 * </p>
	 * <p>
	 * Desc: [(IZZDDDDDD[I)Lnet/minecraft/client/particle/Particle;]
	 * </p>
	 */
	public static McObfPair func_190571_b = McMappingDatabase.getSRG("RenderGlobal.func_190571_b");

	/**
	 * <p>
	 * Name: lastViewEntityZ
	 * </p>
	 */
	public static McObfPair field_174999_J = McMappingDatabase.getSRG("field_174999_J");

	/**
	 * <p>
	 * Name: vertexBufferFormat
	 * </p>
	 */
	public static McObfPair field_175014_r = McMappingDatabase.getSRG("field_175014_r");

	/**
	 * <p>
	 * Name: updateClouds
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_72734_e = McMappingDatabase.getSRG("RenderGlobal.func_72734_e");

	/**
	 * <p>
	 * Name: debugFixedClippingHelper
	 * </p>
	 */
	public static McObfPair field_175001_U = McMappingDatabase.getSRG("field_175001_U");

	/**
	 * <p>
	 * Name: markBlockRangeForRenderUpdate
	 * </p>
	 * <p>
	 * Desc: [(IIIIII)V]
	 * </p>
	 */
	public static McObfPair func_147585_a = McMappingDatabase.getSRG("RenderGlobal.func_147585_a");

	/**
	 * <p>
	 * Name: frustumUpdatePosChunkY
	 * </p>
	 */
	public static McObfPair field_174989_F = McMappingDatabase.getSRG("field_174989_F");

	/**
	 * <p>
	 * Name: addChainedFilledBoxVertices
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/BufferBuilder;DDDDDDFFFF)V]
	 * </p>
	 */
	public static McObfPair func_189693_b = McMappingDatabase.getSRG("RenderGlobal.func_189693_b");

	/**
	 * <p>
	 * Name: lastViewEntityYaw
	 * </p>
	 */
	public static McObfPair field_174994_L = McMappingDatabase.getSRG("field_174994_L");

	/**
	 * <p>
	 * Name: spawnParticle
	 * </p>
	 * <p>
	 * Desc: [(IZDDDDDD[I)V]
	 * </p>
	 */
	public static McObfPair func_180442_a = McMappingDatabase.getSRG("RenderGlobal.func_180442_a");

	/**
	 * <p>
	 * Name: spawnParticle0
	 * </p>
	 * <p>
	 * Desc: [(IZDDDDDD[I)Lnet/minecraft/client/particle/Particle;]
	 * </p>
	 */
	public static McObfPair func_174974_b = McMappingDatabase.getSRG("RenderGlobal.func_174974_b");

	/**
	 * <p>
	 * Name: renderChunkFactory
	 * </p>
	 */
	public static McObfPair field_175007_a = McMappingDatabase.getSRG("field_175007_a");

	/**
	 * <p>
	 * Name: vboEnabled
	 * </p>
	 */
	public static McObfPair field_175005_X = McMappingDatabase.getSRG("field_175005_X");

	/**
	 * <p>
	 * Name: MOON_PHASES_TEXTURES
	 * </p>
	 */
	public static McObfPair field_110927_h = McMappingDatabase.getSRG("field_110927_h");

	/**
	 * <p>
	 * Name: isRenderEntityOutlines
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_174985_d = McMappingDatabase.getSRG("RenderGlobal.func_174985_d");

	/**
	 * <p>
	 * Name: setDisplayListEntitiesDirty
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_174979_m = McMappingDatabase.getSRG("RenderGlobal.func_174979_m");

	/**
	 * <p>
	 * Name: renderSky
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/BufferBuilder;FZ)V]
	 * </p>
	 */
	public static McObfPair func_174968_a = McMappingDatabase.getSRG("RenderGlobal.func_174968_a");

	/**
	 * <p>
	 * Name: renderDispatcher
	 * </p>
	 */
	public static McObfPair field_174995_M = McMappingDatabase.getSRG("field_174995_M");

	/**
	 * <p>
	 * Name: CLOUDS_TEXTURES
	 * </p>
	 */
	public static McObfPair field_110925_j = McMappingDatabase.getSRG("field_110925_j");

	/**
	 * <p>
	 * Name: mapSoundPositions
	 * </p>
	 */
	public static McObfPair field_147593_P = McMappingDatabase.getSRG("field_147593_P");

	/**
	 * <p>
	 * Name: generateSky2
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_174964_o = McMappingDatabase.getSRG("RenderGlobal.func_174964_o");

	/**
	 * <p>
	 * Name: stopChunkUpdates
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_174986_e = McMappingDatabase.getSRG("RenderGlobal.func_174986_e");

	/**
	 * <p>
	 * Name: generateStars
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_174963_q = McMappingDatabase.getSRG("RenderGlobal.func_174963_q");

	/**
	 * <p>
	 * Name: mc
	 * </p>
	 */
	public static McObfPair field_72777_q = McMappingDatabase.getSRG("field_72777_q");

	/**
	 * <p>
	 * Name: lastViewEntityPitch
	 * </p>
	 */
	public static McObfPair field_175000_K = McMappingDatabase.getSRG("field_175000_K");

	/**
	 * <p>
	 * Name: drawSelectionBoundingBox
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/AxisAlignedBB;FFFF)V]
	 * </p>
	 */
	public static McObfPair func_189697_a = McMappingDatabase.getSRG("RenderGlobal.func_189697_a");

	/**
	 * <p>
	 * Name: hasCloudFog
	 * </p>
	 * <p>
	 * Desc: [(DDDF)Z]
	 * </p>
	 */
	public static McObfPair func_72721_a = McMappingDatabase.getSRG("RenderGlobal.func_72721_a");

	/**
	 * <p>
	 * Name: frustumUpdatePosY
	 * </p>
	 */
	public static McObfPair field_174993_C = McMappingDatabase.getSRG("field_174993_C");

	/**
	 * <p>
	 * Name: getRenderChunkOffset
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/client/renderer/chunk/RenderChunk;Lnet/minecraft/util/EnumFacing;)Lnet/minecraft/client/renderer/chunk/RenderChunk;]
	 * </p>
	 */
	public static McObfPair func_181562_a = McMappingDatabase.getSRG("RenderGlobal.func_181562_a");

	/**
	 * <p>
	 * Name: frustumUpdatePosZ
	 * </p>
	 */
	public static McObfPair field_174987_D = McMappingDatabase.getSRG("field_174987_D");

	/**
	 * <p>
	 * Name: renderCloudsFancy
	 * </p>
	 * <p>
	 * Desc: [(FIDDD)V]
	 * </p>
	 */
	public static McObfPair func_180445_c = McMappingDatabase.getSRG("RenderGlobal.func_180445_c");

	/**
	 * <p>
	 * Name: countEntitiesRendered
	 * </p>
	 */
	public static McObfPair field_72749_I = McMappingDatabase.getSRG("field_72749_I");

	/**
	 * <p>
	 * Name: renderManager
	 * </p>
	 */
	public static McObfPair field_175010_j = McMappingDatabase.getSRG("field_175010_j");

	/**
	 * <p>
	 * Name: prevRenderSortZ
	 * </p>
	 */
	public static McObfPair field_147602_h = McMappingDatabase.getSRG("field_147602_h");

	/**
	 * <p>
	 * Name: playEvent
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;ILnet/minecraft/util/math/BlockPos;I)V]
	 * </p>
	 */
	public static McObfPair func_180439_a = McMappingDatabase.getSRG("RenderGlobal.func_180439_a");

	/**
	 * <p>
	 * Name: loadRenderers
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_72712_a = McMappingDatabase.getSRG("RenderGlobal.func_72712_a");

	/**
	 * <p>
	 * Name: renderEntities
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;Lnet/minecraft/client/renderer/culling/ICamera;F)V]
	 * </p>
	 */
	public static McObfPair func_180446_a = McMappingDatabase.getSRG("RenderGlobal.func_180446_a");

	/**
	 * <p>
	 * Name: starGLCallList
	 * </p>
	 */
	public static McObfPair field_72772_v = McMappingDatabase.getSRG("field_72772_v");

	/**
	 * <p>
	 * Name: notifyLightSet
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_174959_b = McMappingDatabase.getSRG("RenderGlobal.func_174959_b");

	/**
	 * <p>
	 * Name: onResourceManagerReload
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/resources/IResourceManager;)V]
	 * </p>
	 */
	public static McObfPair func_110549_a = McMappingDatabase.getSRG("RenderGlobal.func_110549_a");

	/**
	 * <p>
	 * Name: countEntitiesHidden
	 * </p>
	 */
	public static McObfPair field_72750_J = McMappingDatabase.getSRG("field_72750_J");

	/**
	 * <p>
	 * Name: setPartying
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Z)V]
	 * </p>
	 */
	public static McObfPair func_193054_a = McMappingDatabase.getSRG("RenderGlobal.func_193054_a");

	/**
	 * <p>
	 * Name: getDebugInfoEntities
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_72723_d = McMappingDatabase.getSRG("RenderGlobal.func_72723_d");

	/**
	 * <p>
	 * Name: setTileEntities
	 * </p>
	 */
	public static McObfPair field_181024_n = McMappingDatabase.getSRG("field_181024_n");

	/**
	 * <p>
	 * Name: renderBlockLayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/BlockRenderLayer;DILnet/minecraft/entity/Entity;)I]
	 * </p>
	 */
	public static McObfPair func_174977_a = McMappingDatabase.getSRG("RenderGlobal.func_174977_a");

	/**
	 * <p>
	 * Name: renderStars
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/BufferBuilder;)V]
	 * </p>
	 */
	public static McObfPair func_180444_a = McMappingDatabase.getSRG("RenderGlobal.func_180444_a");

	/**
	 * <p>
	 * Name: generateSky
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_174980_p = McMappingDatabase.getSRG("RenderGlobal.func_174980_p");

	/**
	 * <p>
	 * Name: skyVBO
	 * </p>
	 */
	public static McObfPair field_175012_t = McMappingDatabase.getSRG("field_175012_t");

	/**
	 * <p>
	 * Name: frustumUpdatePosX
	 * </p>
	 */
	public static McObfPair field_174992_B = McMappingDatabase.getSRG("field_174992_B");

	/**
	 * <p>
	 * Name: damagedBlocks
	 * </p>
	 */
	public static McObfPair field_72738_E = McMappingDatabase.getSRG("field_72738_E");

	/**
	 * <p>
	 * Name: updateTileEntities
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Collection;Ljava/util/Collection;)V]
	 * </p>
	 */
	public static McObfPair func_181023_a = McMappingDatabase.getSRG("RenderGlobal.func_181023_a");

	/**
	 * <p>
	 * Name: debugFixTerrainFrustum
	 * </p>
	 */
	public static McObfPair field_175002_T = McMappingDatabase.getSRG("field_175002_T");

	/**
	 * <p>
	 * Name: notifyBlockUpdate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/block/state/IBlockState;I)V]
	 * </p>
	 */
	public static McObfPair func_184376_a = McMappingDatabase.getSRG("RenderGlobal.func_184376_a");

	/**
	 * <p>
	 * Name: getDebugInfoRenders
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_72735_c = McMappingDatabase.getSRG("RenderGlobal.func_72735_c");

	/**
	 * <p>
	 * Name: entityOutlineShader
	 * </p>
	 */
	public static McObfPair field_174991_A = McMappingDatabase.getSRG("field_174991_A");

	/**
	 * <p>
	 * Name: getRenderedChunks
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_184382_g = McMappingDatabase.getSRG("RenderGlobal.func_184382_g");

	/**
	 * <p>
	 * Name: cloudTickCounter
	 * </p>
	 */
	public static McObfPair field_72773_u = McMappingDatabase.getSRG("field_72773_u");

	/**
	 * <p>
	 * Name: prevRenderSortX
	 * </p>
	 */
	public static McObfPair field_147596_f = McMappingDatabase.getSRG("field_147596_f");

	/**
	 * <p>
	 * Name: glSkyList2
	 * </p>
	 */
	public static McObfPair field_72781_x = McMappingDatabase.getSRG("field_72781_x");

	/**
	 * <p>
	 * Name: SUN_TEXTURES
	 * </p>
	 */
	public static McObfPair field_110928_i = McMappingDatabase.getSRG("field_110928_i");

	/**
	 * <p>
	 * Name: drawBoundingBox
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/BufferBuilder;DDDDDDFFFF)V]
	 * </p>
	 */
	public static McObfPair func_189698_a = McMappingDatabase.getSRG("RenderGlobal.func_189698_a");

	/**
	 * <p>
	 * Name: entityOutlinesRendered
	 * </p>
	 */
	public static McObfPair field_184386_ad = McMappingDatabase.getSRG("field_184386_ad");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_147599_m = McMappingDatabase.getSRG("field_147599_m");

	/**
	 * <p>
	 * Name: isOutlineActive
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;Lnet/minecraft/entity/Entity;Lnet/minecraft/client/renderer/culling/ICamera;)Z]
	 * </p>
	 */
	public static McObfPair func_184383_a = McMappingDatabase.getSRG("RenderGlobal.func_184383_a");

	/**
	 * <p>
	 * Name: spawnParticle
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumParticleTypes;DDDDDD[I)V]
	 * </p>
	 */
	public static McObfPair func_174972_a = McMappingDatabase.getSRG("RenderGlobal.func_174972_a");

	/**
	 * <p>
	 * Name: getVisibleFacings
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Ljava/util/Set;]
	 * </p>
	 */
	public static McObfPair func_174978_c = McMappingDatabase.getSRG("RenderGlobal.func_174978_c");

	/**
	 * <p>
	 * Name: spawnParticle
	 * </p>
	 * <p>
	 * Desc: [(IZZDDDDDD[I)V]
	 * </p>
	 */
	public static McObfPair func_190570_a = McMappingDatabase.getSRG("RenderGlobal.func_190570_a");

	/**
	 * <p>
	 * Name: renderClouds
	 * </p>
	 * <p>
	 * Desc: [(FIDDD)V]
	 * </p>
	 */
	public static McObfPair func_180447_b = McMappingDatabase.getSRG("RenderGlobal.func_180447_b");

	/**
	 * <p>
	 * Name: prevRenderSortY
	 * </p>
	 */
	public static McObfPair field_147597_g = McMappingDatabase.getSRG("field_147597_g");

	/**
	 * <p>
	 * Name: setWorldAndLoadRenderers
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/multiplayer/WorldClient;)V]
	 * </p>
	 */
	public static McObfPair func_72732_a = McMappingDatabase.getSRG("RenderGlobal.func_72732_a");

	/**
	 * <p>
	 * Name: deleteAllDisplayLists
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_72728_f = McMappingDatabase.getSRG("RenderGlobal.func_72728_f");

	/**
	 * <p>
	 * Name: destroyBlockIcons
	 * </p>
	 */
	public static McObfPair field_94141_F = McMappingDatabase.getSRG("field_94141_F");

	/**
	 * <p>
	 * Name: lastViewEntityY
	 * </p>
	 */
	public static McObfPair field_174998_I = McMappingDatabase.getSRG("field_174998_I");

	/**
	 * <p>
	 * Name: renderEngine
	 * </p>
	 */
	public static McObfPair field_72770_i = McMappingDatabase.getSRG("field_72770_i");

	/**
	 * <p>
	 * Name: chunksToUpdate
	 * </p>
	 */
	public static McObfPair field_175009_l = McMappingDatabase.getSRG("field_175009_l");

	/**
	 * <p>
	 * Name: glSkyList
	 * </p>
	 */
	public static McObfPair field_72771_w = McMappingDatabase.getSRG("field_72771_w");

	/**
	 * <p>
	 * Name: debugTerrainMatrix
	 * </p>
	 */
	public static McObfPair field_175004_V = McMappingDatabase.getSRG("field_175004_V");

	/**
	 * <p>
	 * Name: playRecord
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/SoundEvent;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_184377_a = McMappingDatabase.getSRG("RenderGlobal.func_184377_a");

	/**
	 * <p>
	 * Name: debugTerrainFrustumPosition
	 * </p>
	 */
	public static McObfPair field_175003_W = McMappingDatabase.getSRG("field_175003_W");

	/**
	 * <p>
	 * Name: makeEntityOutlineShader
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_174966_b = McMappingDatabase.getSRG("RenderGlobal.func_174966_b");

	/**
	 * <p>
	 * Name: sky2VBO
	 * </p>
	 */
	public static McObfPair field_175011_u = McMappingDatabase.getSRG("field_175011_u");

	/**
	 * <p>
	 * Name: viewFrustum
	 * </p>
	 */
	public static McObfPair field_175008_n = McMappingDatabase.getSRG("field_175008_n");

	/**
	 * <p>
	 * Name: onEntityRemoved
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_72709_b = McMappingDatabase.getSRG("RenderGlobal.func_72709_b");

	/**
	 * <p>
	 * Name: lastViewEntityX
	 * </p>
	 */
	public static McObfPair field_174997_H = McMappingDatabase.getSRG("field_174997_H");

	/**
	 * <p>
	 * Name: updateDestroyBlockIcons
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_174971_n = McMappingDatabase.getSRG("RenderGlobal.func_174971_n");

	/**
	 * <p>
	 * Name: entityOutlineFramebuffer
	 * </p>
	 */
	public static McObfPair field_175015_z = McMappingDatabase.getSRG("field_175015_z");

	/**
	 * <p>
	 * Name: world
	 * </p>
	 */
	public static McObfPair field_72769_h = McMappingDatabase.getSRG("field_72769_h");

	/**
	 * <p>
	 * Name: createBindEntityOutlineFbs
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_72720_a = McMappingDatabase.getSRG("RenderGlobal.func_72720_a");

	/**
	 * <p>
	 * Name: renderWorldBorder
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;F)V]
	 * </p>
	 */
	public static McObfPair func_180449_a = McMappingDatabase.getSRG("RenderGlobal.func_180449_a");

	/**
	 * <p>
	 * Name: countEntitiesTotal
	 * </p>
	 */
	public static McObfPair field_72748_H = McMappingDatabase.getSRG("field_72748_H");

	/**
	 * <p>
	 * Name: renderFilledBox
	 * </p>
	 * <p>
	 * Desc: [(DDDDDDFFFF)V]
	 * </p>
	 */
	public static McObfPair func_189695_b = McMappingDatabase.getSRG("RenderGlobal.func_189695_b");

	/**
	 * <p>
	 * Name: FORCEFIELD_TEXTURES
	 * </p>
	 */
	public static McObfPair field_175006_g = McMappingDatabase.getSRG("field_175006_g");

	/**
	 * <p>
	 * Name: renderEntitiesStartupCounter
	 * </p>
	 */
	public static McObfPair field_72740_G = McMappingDatabase.getSRG("field_72740_G");

	/**
	 * <p>
	 * Name: displayListEntitiesDirty
	 * </p>
	 */
	public static McObfPair field_147595_R = McMappingDatabase.getSRG("field_147595_R");

	/**
	 * <p>
	 * Name: renderInfos
	 * </p>
	 */
	public static McObfPair field_72755_R = McMappingDatabase.getSRG("field_72755_R");

	/**
	 * <p>
	 * Name: setLightUpdates
	 * </p>
	 */
	public static McObfPair field_184387_ae = McMappingDatabase.getSRG("field_184387_ae");

	/**
	 * <p>
	 * Name: markBlocksForUpdate
	 * </p>
	 * <p>
	 * Desc: [(IIIIIIZ)V]
	 * </p>
	 */
	public static McObfPair func_184385_a = McMappingDatabase.getSRG("RenderGlobal.func_184385_a");

	/**
	 * <p>
	 * Name: cleanupDamagedBlocks
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Iterator;)V]
	 * </p>
	 */
	public static McObfPair func_174965_a = McMappingDatabase.getSRG("RenderGlobal.func_174965_a");

	/**
	 * <p>
	 * Name: getViewVector
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;D)Lorg/lwjgl/util/vector/Vector3f;]
	 * </p>
	 */
	public static McObfPair func_174962_a = McMappingDatabase.getSRG("RenderGlobal.func_174962_a");

	/**
	 * <p>
	 * Name: drawBlockDamageTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/Tessellator;Lnet/minecraft/client/renderer/BufferBuilder;Lnet/minecraft/entity/Entity;F)V]
	 * </p>
	 */
	public static McObfPair func_174981_a = McMappingDatabase.getSRG("RenderGlobal.func_174981_a");

	/**
	 * <p>
	 * Name: renderSky
	 * </p>
	 * <p>
	 * Desc: [(FI)V]
	 * </p>
	 */
	public static McObfPair func_174976_a = McMappingDatabase.getSRG("RenderGlobal.func_174976_a");

	/**
	 * <p>
	 * Name: fixTerrainFrustum
	 * </p>
	 * <p>
	 * Desc: [(DDD)V]
	 * </p>
	 */
	public static McObfPair func_174984_a = McMappingDatabase.getSRG("RenderGlobal.func_174984_a");

	/**
	 * <p>
	 * Name: onEntityAdded
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_72703_a = McMappingDatabase.getSRG("RenderGlobal.func_72703_a");

	/**
	 * <p>
	 * Name: broadcastSound
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/util/math/BlockPos;I)V]
	 * </p>
	 */
	public static McObfPair func_180440_a = McMappingDatabase.getSRG("RenderGlobal.func_180440_a");

	/**
	 * <p>
	 * Name: renderSkyEnd
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_180448_r = McMappingDatabase.getSRG("RenderGlobal.func_180448_r");

	/**
	 * <p>
	 * Name: renderEntityOutlineFramebuffer
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_174975_c = McMappingDatabase.getSRG("RenderGlobal.func_174975_c");

	/**
	 * <p>
	 * Name: updateChunks
	 * </p>
	 * <p>
	 * Desc: [(J)V]
	 * </p>
	 */
	public static McObfPair func_174967_a = McMappingDatabase.getSRG("RenderGlobal.func_174967_a");

	/**
	 * <p>
	 * Name: starVBO
	 * </p>
	 */
	public static McObfPair field_175013_s = McMappingDatabase.getSRG("field_175013_s");

	/**
	 * <p>
	 * Name: sendBlockBreakProgress
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/util/math/BlockPos;I)V]
	 * </p>
	 */
	public static McObfPair func_180441_b = McMappingDatabase.getSRG("RenderGlobal.func_180441_b");

	/**
	 * <p>
	 * Name: drawSelectionBox
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/math/RayTraceResult;IF)V]
	 * </p>
	 */
	public static McObfPair func_72731_b = McMappingDatabase.getSRG("RenderGlobal.func_72731_b");

	/**
	 * <p>
	 * Name: postRenderDamagedBlocks
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_174969_t = McMappingDatabase.getSRG("RenderGlobal.func_174969_t");

	/**
	 * <p>
	 * Name: renderContainer
	 * </p>
	 */
	public static McObfPair field_174996_N = McMappingDatabase.getSRG("field_174996_N");

	/**
	 * <p>
	 * Name: hasNoChunkUpdates
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_184384_n = McMappingDatabase.getSRG("RenderGlobal.func_184384_n");

	/**
	 * <p>
	 * Name: END_SKY_TEXTURES
	 * </p>
	 */
	public static McObfPair field_110926_k = McMappingDatabase.getSRG("field_110926_k");

	/**
	 * <p>
	 * Name: renderBlockLayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/BlockRenderLayer;)V]
	 * </p>
	 */
	public static McObfPair func_174982_a = McMappingDatabase.getSRG("RenderGlobal.func_174982_a");

	/**
	 * <p>
	 * Name: drawBoundingBox
	 * </p>
	 * <p>
	 * Desc: [(DDDDDDFFFF)V]
	 * </p>
	 */
	public static McObfPair func_189694_a = McMappingDatabase.getSRG("RenderGlobal.func_189694_a");

	/**
	 * <p>
	 * Name: setupTerrain
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;DLnet/minecraft/client/renderer/culling/ICamera;IZ)V]
	 * </p>
	 */
	public static McObfPair func_174970_a = McMappingDatabase.getSRG("RenderGlobal.func_174970_a");

	/**
	 * <p>
	 * Name: renderFilledBox
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/AxisAlignedBB;FFFF)V]
	 * </p>
	 */
	public static McObfPair func_189696_b = McMappingDatabase.getSRG("RenderGlobal.func_189696_b");

}
