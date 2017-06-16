.class public Lorg/pouyadr/SQLite/SQLiteException;
.super Ljava/lang/Exception;
.source "SQLiteException.java"


# static fields
.field private static final serialVersionUID:J = -0x214877c28f7f0305L


# instance fields
.field public final errorCode:I


# direct methods
.method public constructor <init>()V
    .registers 2

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    .line 25
    const/4 v0, 0x0

    iput v0, p0, Lorg/pouyadr/SQLite/SQLiteException;->errorCode:I

    .line 26
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;)V
    .registers 3
    .param p1, "errcode"    # I
    .param p2, "msg"    # Ljava/lang/String;

    .prologue
    .line 16
    invoke-direct {p0, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 17
    iput p1, p0, Lorg/pouyadr/SQLite/SQLiteException;->errorCode:I

    .line 18
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .registers 3
    .param p1, "msg"    # Ljava/lang/String;

    .prologue
    .line 21
    const/4 v0, 0x0

    invoke-direct {p0, v0, p1}, Lorg/pouyadr/SQLite/SQLiteException;-><init>(ILjava/lang/String;)V

    .line 22
    return-void
.end method
