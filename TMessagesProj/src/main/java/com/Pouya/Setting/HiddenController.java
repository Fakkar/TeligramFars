.class public Lorg/pouyadr/Pouya/Setting/HiddenController;
.super Ljava/lang/Object;
.source "HiddenController.java"


# static fields
.field private static fav:Lorg/pouyadr/Pouya/Setting/HiddenController;

.field private static thiscontext:Landroid/content/Context;


# direct methods
.method public constructor <init>()V
    .registers 1

    .prologue
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static IsHidden(Ljava/lang/Long;)Z
    .registers 2
    .param p0, "aLong"    # Ljava/lang/Long;

    .prologue
    .line 33
    invoke-static {p0}, Lorg/pouyadr/Pouya/Setting/HiddenController;->isHidden(Ljava/lang/Long;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public static addToHidden(Ljava/lang/Long;)V
    .registers 4
    .param p0, "id"    # Ljava/lang/Long;

    .prologue
    .line 14
    invoke-static {}, Lorg/pouyadr/Pouya/Setting/Setting;->getHiddenList()Ljava/lang/String;

    move-result-object v0

    .line 15
    .local v0, "m":Ljava/lang/String;
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 16
    invoke-static {v0}, Lorg/pouyadr/Pouya/Setting/Setting;->setHiddenList(Ljava/lang/String;)V

    .line 17
    return-void
.end method

.method public static addToHidden(Ljava/lang/String;)V
    .registers 4
    .param p0, "user"    # Ljava/lang/String;

    .prologue
    .line 19
    invoke-static {}, Lorg/pouyadr/Pouya/Setting/Setting;->getHiddenList()Ljava/lang/String;

    move-result-object v0

    .line 20
    .local v0, "m":Ljava/lang/String;
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 21
    invoke-static {v0}, Lorg/pouyadr/Pouya/Setting/Setting;->setHiddenList(Ljava/lang/String;)V

    .line 22
    return-void
.end method

.method public static isHidden(Ljava/lang/Long;)Ljava/lang/Boolean;
    .registers 4
    .param p0, "id"    # Ljava/lang/Long;

    .prologue
    .line 28
    invoke-static {}, Lorg/pouyadr/Pouya/Setting/Setting;->getHiddenList()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    .line 29
    .local v0, "m":Z
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    return-object v1
.end method

.method public static isHidden(Ljava/lang/String;)Ljava/lang/Boolean;
    .registers 4
    .param p0, "user"    # Ljava/lang/String;

    .prologue
    .line 24
    invoke-static {}, Lorg/pouyadr/Pouya/Setting/Setting;->getHiddenList()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    .line 25
    .local v0, "m":Z
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    return-object v1
.end method
