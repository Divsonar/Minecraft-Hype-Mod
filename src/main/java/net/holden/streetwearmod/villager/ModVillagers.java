package net.holden.streetwearmod.villager;

import com.google.common.collect.ImmutableSet;
import net.holden.streetwearmod.StreetwearMod;
import net.holden.streetwearmod.block.ModBlocks;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.util.ObfuscationReflectionHelper;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.lang.reflect.InvocationTargetException;

public class ModVillagers {
    public static final DeferredRegister<PoiType> POI_TYPES =
            DeferredRegister.create(ForgeRegistries.POI_TYPES, StreetwearMod.MOD_ID);
    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS =
            DeferredRegister.create(ForgeRegistries.VILLAGER_PROFESSIONS, StreetwearMod.MOD_ID);

    public static final RegistryObject<PoiType> HYPE_BLOCK_POI = POI_TYPES.register("hype_block_poi",
            () -> new PoiType(ImmutableSet.copyOf(ModBlocks.HYPE_BLOCK.get().getStateDefinition().getPossibleStates()),
                    1,1));

    public static final RegistryObject<VillagerProfession> HYPE_DEALER = VILLAGER_PROFESSIONS.register("hype_dealer",
            () -> new VillagerProfession("hype_dealer", x -> x.get() == HYPE_BLOCK_POI.get(),
                    x -> x.get() == HYPE_BLOCK_POI.get(), ImmutableSet.of(), ImmutableSet.of(),
                    SoundEvents.VILLAGER_WORK_ARMORER));

    public static void registerPOIs() {
        try{
            ObfuscationReflectionHelper.findMethod(PoiType.class, "registerBlockStates", PoiType.class).invoke(null, HYPE_BLOCK_POI.get());
        }   catch (InvocationTargetException | IllegalAccessException exception) {
            exception.printStackTrace();
        }
    }

    public static void register(IEventBus eventBus) {
        POI_TYPES.register(eventBus);
        VILLAGER_PROFESSIONS.register(eventBus);
    }
}
