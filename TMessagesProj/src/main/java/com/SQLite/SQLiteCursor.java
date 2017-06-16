.class public Lorg/pouyadr/SQLite/SQLiteCursor;
.super Ljava/lang/Object;
.source "SQLiteCursor.java"


# static fields
.field public static final FIELD_TYPE_BYTEARRAY:I = 0x4

.field public static final FIELD_TYPE_FLOAT:I = 0x2

.field public static final FIELD_TYPE_INT:I = 0x1

.field public static final FIELD_TYPE_NULL:I = 0x5

.field public static final FIELD_TYPE_STRING:I = 0x3


# instance fields
.field inRow:Z

.field preparedStatement:Lorg/pouyadr/SQLite/SQLitePreparedStatement;


# direct methods
.method public constructor <init>(Lorg/pouyadr/SQLite/SQLitePreparedStatement;)V
    .registers 3
    .param p1, "stmt"    # Lorg/pouyadr/SQLite/SQLitePreparedStatement;

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/pouyadr/SQLite/SQLiteCursor;->inRow:Z

    .line 26
    iput-object p1, p0, Lorg/pouyadr/SQLite/SQLiteCursor;->preparedStatement:Lorg/pouyadr/SQLite/SQLitePreparedStatement;

    .line 27
    return-void
.end method


# virtual methods
.method public byteArrayValue(I)[B
    .registers 3
    .param p1, "columnIndex"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/pouyadr/SQLite/SQLiteException;
        }
    .end annotation

    .prologue
    .line 55
    invoke-virtual {p0}, Lorg/pouyadr/SQLite/SQLiteCursor;->checkRow()V

    .line 56
    iget-object v0, p0, Lorg/pouyadr/SQLite/SQLiteCursor;->preparedStatement:Lorg/pouyadr/SQLite/SQLitePreparedStatement;

    invoke-virtual {v0}, Lorg/pouyadr/SQLite/SQLitePreparedStatement;->getStatementHandle()I

    move-result v0

    invoke-virtual {p0, v0, p1}, Lorg/pouyadr/SQLite/SQLiteCursor;->columnByteArrayValue(II)[B

    move-result-object v0

    return-object v0
.end method

.method public byteBufferValue(I)Lorg/pouyadr/tgnet/NativeByteBuffer;
    .registers 4
    .param p1, "columnIndex"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/pouyadr/SQLite/SQLiteException;
        }
    .end annotation

    .prologue
    .line 60
    invoke-virtual {p0}, Lorg/pouyadr/SQLite/SQLiteCursor;->checkRow()V

    .line 61
    iget-object v1, p0, Lorg/pouyadr/SQLite/SQLiteCursor;->preparedStatement:Lorg/pouyadr/SQLite/SQLitePreparedStatement;

    invoke-virtual {v1}, Lorg/pouyadr/SQLite/SQLitePreparedStatement;->getStatementHandle()I

    move-result v1

    invoke-virtual {p0, v1, p1}, Lorg/pouyadr/SQLite/SQLiteCursor;->columnByteBufferValue(II)I

    move-result v0

    .line 62
    .local v0, "ptr":I
    if-eqz v0, :cond_14

    .line 63
    invoke-static {v0}, Lorg/pouyadr/tgnet/NativeByteBuffer;->wrap(I)Lorg/pouyadr/tgnet/NativeByteBuffer;

    move-result-object v1

    .line 65
    :goto_13
    return-object v1

    :cond_14
    const/4 v1, 0x0

    goto :goto_13
.end method

.method checkRow()V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/pouyadr/SQLite/SQLiteException;
        }
    .end annotation

    .prologue
    .line 106
    iget-boolean v0, p0, Lorg/pouyadr/SQLite/SQLiteCursor;->inRow:Z

    if-nez v0, :cond_c

    .line 107
    new-instance v0, Lorg/pouyadr/SQLite/SQLiteException;

    const-string v1, "You must call next before"

    invoke-direct {v0, v1}, Lorg/pouyadr/SQLite/SQLiteException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 109
    :cond_c
    return-void
.end method

.method native columnByteArrayValue(II)[B
.end method

.method native columnByteBufferValue(II)I
.end method

.method native columnDoubleValue(II)D
.end method

.method native columnIntValue(II)I
.end method

.method native columnIsNull(II)I
.end method

.method native columnLongValue(II)J
.end method

.method native columnStringValue(II)Ljava/lang/String;
.end method

.method native columnType(II)I
.end method

.method public dispose()V
    .registers 2

    .prologue
    .line 102
    iget-object v0, p0, Lorg/pouyadr/SQLite/SQLiteCursor;->preparedStatement:Lorg/pouyadr/SQLite/SQLitePreparedStatement;

    invoke-virtual {v0}, Lorg/pouyadr/SQLite/SQLitePreparedStatement;->dispose()V

    .line 103
    return-void
.end method

.method public doubleValue(I)D
    .registers 4
    .param p1, "columnIndex"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/pouyadr/SQLite/SQLiteException;
        }
    .end annotation

    .prologue
    .line 40
    invoke-virtual {p0}, Lorg/pouyadr/SQLite/SQLiteCursor;->checkRow()V

    .line 41
    iget-object v0, p0, Lorg/pouyadr/SQLite/SQLiteCursor;->preparedStatement:Lorg/pouyadr/SQLite/SQLitePreparedStatement;

    invoke-virtual {v0}, Lorg/pouyadr/SQLite/SQLitePreparedStatement;->getStatementHandle()I

    move-result v0

    invoke-virtual {p0, v0, p1}, Lorg/pouyadr/SQLite/SQLiteCursor;->columnDoubleValue(II)D

    move-result-wide v0

    return-wide v0
.end method

.method public getStatementHandle()I
    .registers 2

    .prologue
    .line 98
    iget-object v0, p0, Lorg/pouyadr/SQLite/SQLiteCursor;->preparedStatement:Lorg/pouyadr/SQLite/SQLitePreparedStatement;

    invoke-virtual {v0}, Lorg/pouyadr/SQLite/SQLitePreparedStatement;->getStatementHandle()I

    move-result v0

    return v0
.end method

.method public getTypeOf(I)I
    .registers 3
    .param p1, "columnIndex"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/pouyadr/SQLite/SQLiteException;
        }
    .end annotation

    .prologue
    .line 69
    invoke-virtual {p0}, Lorg/pouyadr/SQLite/SQLiteCursor;->checkRow()V

    .line 70
    iget-object v0, p0, Lorg/pouyadr/SQLite/SQLiteCursor;->preparedStatement:Lorg/pouyadr/SQLite/SQLitePreparedStatement;

    invoke-virtual {v0}, Lorg/pouyadr/SQLite/SQLitePreparedStatement;->getStatementHandle()I

    move-result v0

    invoke-virtual {p0, v0, p1}, Lorg/pouyadr/SQLite/SQLiteCursor;->columnType(II)I

    move-result v0

    return v0
.end method

.method public intValue(I)I
    .registers 3
    .param p1, "columnIndex"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/pouyadr/SQLite/SQLiteException;
        }
    .end annotation

    .prologue
    .line 35
    invoke-virtual {p0}, Lorg/pouyadr/SQLite/SQLiteCursor;->checkRow()V

    .line 36
    iget-object v0, p0, Lorg/pouyadr/SQLite/SQLiteCursor;->preparedStatement:Lorg/pouyadr/SQLite/SQLitePreparedStatement;

    invoke-virtual {v0}, Lorg/pouyadr/SQLite/SQLitePreparedStatement;->getStatementHandle()I

    move-result v0

    invoke-virtual {p0, v0, p1}, Lorg/pouyadr/SQLite/SQLiteCursor;->columnIntValue(II)I

    move-result v0

    return v0
.end method

.method public isNull(I)Z
    .registers 4
    .param p1, "columnIndex"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/pouyadr/SQLite/SQLiteException;
        }
    .end annotation

    .prologue
    const/4 v0, 0x1

    .line 30
    invoke-virtual {p0}, Lorg/pouyadr/SQLite/SQLiteCursor;->checkRow()V

    .line 31
    iget-object v1, p0, Lorg/pouyadr/SQLite/SQLiteCursor;->preparedStatement:Lorg/pouyadr/SQLite/SQLitePreparedStatement;

    invoke-virtual {v1}, Lorg/pouyadr/SQLite/SQLitePreparedStatement;->getStatementHandle()I

    move-result v1

    invoke-virtual {p0, v1, p1}, Lorg/pouyadr/SQLite/SQLiteCursor;->columnIsNull(II)I

    move-result v1

    if-ne v1, v0, :cond_11

    :goto_10
    return v0

    :cond_11
    const/4 v0, 0x0

    goto :goto_10
.end method

.method public longValue(I)J
    .registers 4
    .param p1, "columnIndex"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/pouyadr/SQLite/SQLiteException;
        }
    .end annotation

    .prologue
    .line 45
    invoke-virtual {p0}, Lorg/pouyadr/SQLite/SQLiteCursor;->checkRow()V

    .line 46
    iget-object v0, p0, Lorg/pouyadr/SQLite/SQLiteCursor;->preparedStatement:Lorg/pouyadr/SQLite/SQLitePreparedStatement;

    invoke-virtual {v0}, Lorg/pouyadr/SQLite/SQLitePreparedStatement;->getStatementHandle()I

    move-result v0

    invoke-virtual {p0, v0, p1}, Lorg/pouyadr/SQLite/SQLiteCursor;->columnLongValue(II)J

    move-result-wide v0

    return-wide v0
.end method

.method public next()Z
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/pouyadr/SQLite/SQLiteException;
        }
    .end annotation

    .prologue
    const/4 v6, -0x1

    .line 74
    iget-object v4, p0, Lorg/pouyadr/SQLite/SQLiteCursor;->preparedStatement:Lorg/pouyadr/SQLite/SQLitePreparedStatement;

    iget-object v5, p0, Lorg/pouyadr/SQLite/SQLiteCursor;->preparedStatement:Lorg/pouyadr/SQLite/SQLitePreparedStatement;

    invoke-virtual {v5}, Lorg/pouyadr/SQLite/SQLitePreparedStatement;->getStatementHandle()I

    move-result v5

    invoke-virtual {v4, v5}, Lorg/pouyadr/SQLite/SQLitePreparedStatement;->step(I)I

    move-result v3

    .line 75
    .local v3, "res":I
    if-ne v3, v6, :cond_3d

    .line 76
    const/4 v1, 0x6

    .local v1, "repeatCount":I
    move v2, v1

    .line 77
    .end local v1    # "repeatCount":I
    .local v2, "repeatCount":I
    :goto_11
    add-int/lit8 v1, v2, -0x1

    .end local v2    # "repeatCount":I
    .restart local v1    # "repeatCount":I
    if-eqz v2, :cond_29

    .line 79
    :try_start_15
    const-string v4, "tmessages"

    const-string v5, "sqlite busy, waiting..."

    invoke-static {v4, v5}, Lorg/pouyadr/messenger/FileLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    const-wide/16 v4, 0x1f4

    invoke-static {v4, v5}, Ljava/lang/Thread;->sleep(J)V

    .line 81
    iget-object v4, p0, Lorg/pouyadr/SQLite/SQLiteCursor;->preparedStatement:Lorg/pouyadr/SQLite/SQLitePreparedStatement;

    invoke-virtual {v4}, Lorg/pouyadr/SQLite/SQLitePreparedStatement;->step()I
    :try_end_26
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_26} :catch_35

    move-result v3

    .line 82
    if-nez v3, :cond_33

    .line 89
    :cond_29
    if-ne v3, v6, :cond_3d

    .line 90
    new-instance v4, Lorg/pouyadr/SQLite/SQLiteException;

    const-string v5, "sqlite busy"

    invoke-direct {v4, v5}, Lorg/pouyadr/SQLite/SQLiteException;-><init>(Ljava/lang/String;)V

    throw v4

    :cond_33
    move v2, v1

    .line 87
    .end local v1    # "repeatCount":I
    .restart local v2    # "repeatCount":I
    goto :goto_11

    .line 85
    .end local v2    # "repeatCount":I
    .restart local v1    # "repeatCount":I
    :catch_35
    move-exception v0

    .line 86
    .local v0, "e":Ljava/lang/Exception;
    const-string v4, "tmessages"

    invoke-static {v4, v0}, Lorg/pouyadr/messenger/FileLog;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    move v2, v1

    .line 87
    .end local v1    # "repeatCount":I
    .restart local v2    # "repeatCount":I
    goto :goto_11

    .line 93
    .end local v0    # "e":Ljava/lang/Exception;
    .end local v2    # "repeatCount":I
    :cond_3d
    if-nez v3, :cond_45

    const/4 v4, 0x1

    :goto_40
    iput-boolean v4, p0, Lorg/pouyadr/SQLite/SQLiteCursor;->inRow:Z

    .line 94
    iget-boolean v4, p0, Lorg/pouyadr/SQLite/SQLiteCursor;->inRow:Z

    return v4

    .line 93
    :cond_45
    const/4 v4, 0x0

    goto :goto_40
.end method

.method public stringValue(I)Ljava/lang/String;
    .registers 3
    .param p1, "columnIndex"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/pouyadr/SQLite/SQLiteException;
        }
    .end annotation

    .prologue
    .line 50
    invoke-virtual {p0}, Lorg/pouyadr/SQLite/SQLiteCursor;->checkRow()V

    .line 51
    iget-object v0, p0, Lorg/pouyadr/SQLite/SQLiteCursor;->preparedStatement:Lorg/pouyadr/SQLite/SQLitePreparedStatement;

    invoke-virtual {v0}, Lorg/pouyadr/SQLite/SQLitePreparedStatement;->getStatementHandle()I

    move-result v0

    invoke-virtual {p0, v0, p1}, Lorg/pouyadr/SQLite/SQLiteCursor;->columnStringValue(II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
