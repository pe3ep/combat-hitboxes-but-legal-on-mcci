package me.sootysplash.box;

import net.minecraft.entity.Entity;

public interface EntityRenderStateAccessor {

    void setEntityOverride_combat_hitboxes(Entity ent);

    Entity getEntityOverride_combat_hitboxes();

}
