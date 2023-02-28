package net.holden.streetwearmod.item;

import net.holden.streetwearmod.StreetwearMod;
import net.holden.streetwearmod.base.ModArmorMaterial;
import net.minecraft.client.Minecraft;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, StreetwearMod.MOD_ID);


    public static final RegistryObject<Item> ZIRCON = ITEMS.register("zircon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.STREETWEAR_TAB)));
    public static final RegistryObject<Item> HYPE_FRAGMENT = ITEMS.register("hype_fragment",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.STREETWEAR_TAB)));
    public static final RegistryObject<Item> STONE_ISLAND_BADGE = ITEMS.register("stone_island_badge",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.STREETWEAR_TAB)));

    public static final RegistryObject<ArmorItem> BLUE_STONE_ISLAND_SWEATSHIRT = ITEMS.register("blue_stone_island_sweatshirt",
            () -> new ArmorItem(ArmorTiers.STONE_ISLAND_MATERIAL, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.STREETWEAR_TAB)));
    public static final RegistryObject<ArmorItem> BLUE_STONE_ISLAND_CAP = ITEMS.register("blue_stone_island_cap",
            () -> new ArmorItem(ArmorTiers.STONE_ISLAND_MATERIAL, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.STREETWEAR_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static class ArmorTiers {
        public static final ArmorMaterial STONE_ISLAND_MATERIAL = new ModArmorMaterial(
                "stone_island_material",
                33,
                new int[] {3, 6, 8, 3},
                25,
                SoundEvents.ARMOR_EQUIP_LEATHER,
                2f,
                0f,
                () -> Ingredient.of(ModItems.BLUE_STONE_ISLAND_SWEATSHIRT.get())
        );
    }
}
