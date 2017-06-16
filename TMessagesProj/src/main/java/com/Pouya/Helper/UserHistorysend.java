.class public Lorg/pouyadr/Pouya/Helper/UserHistorysend;
.super Ljava/lang/Object;
.source "UserHistorysend.java"


# static fields
.field private static list:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .prologue
    .line 10
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lorg/pouyadr/Pouya/Helper/UserHistorysend;->list:Ljava/util/HashMap;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    .prologue
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static add(J)V
    .registers 8
    .param p0, "userid"    # J

    .prologue
    .line 27
    sget-object v0, Lorg/pouyadr/Pouya/Helper/UserHistorysend;->list:Ljava/util/HashMap;

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    sget-object v0, Lorg/pouyadr/Pouya/Helper/UserHistorysend;->list:Ljava/util/HashMap;

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    new-instance v2, Ljava/util/Date;

    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    const-wide/16 v4, 0x4e20

    add-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    return-void
.end method

.method public static isok(Ljava/lang/Long;)Z
    .registers 7
    .param p0, "userid"    # Ljava/lang/Long;

    .prologue
    const/4 v1, 0x1

    .line 12
    sget-object v0, Lorg/pouyadr/Pouya/Helper/UserHistorysend;->list:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result v0

    if-nez v0, :cond_b

    move v0, v1

    .line 22
    :goto_a
    return v0

    .line 13
    :cond_b
    sget-object v0, Lorg/pouyadr/Pouya/Helper/UserHistorysend;->list:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_35

    .line 14
    sget-object v0, Lorg/pouyadr/Pouya/Helper/UserHistorysend;->list:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    cmp-long v0, v2, v4

    if-gez v0, :cond_33

    .line 15
    sget-object v0, Lorg/pouyadr/Pouya/Helper/UserHistorysend;->list:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move v0, v1

    .line 16
    goto :goto_a

    .line 19
    :cond_33
    const/4 v0, 0x0

    goto :goto_a

    :cond_35
    move v0, v1

    .line 22
    goto :goto_a
.end method
