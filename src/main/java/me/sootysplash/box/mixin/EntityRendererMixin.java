package me.sootysplash.box.mixin;

import me.sootysplash.box.EntityRenderStateAccessor;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.state.EntityRenderState;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(EntityRenderer.class)
public class EntityRendererMixin {

    @Inject(method = "updateRenderState", at = @At("HEAD"))
    private void onUpdateRenderState(Entity entity, EntityRenderState state, float tickProgress, CallbackInfo ci) {
        ((EntityRenderStateAccessor) state).setEntityOverride_combat_hitboxes(entity);
    }
}
