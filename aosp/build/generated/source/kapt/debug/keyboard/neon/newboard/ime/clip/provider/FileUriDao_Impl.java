package keyboard.neon.newboard.ime.clip.provider;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class FileUriDao_Impl implements FileUriDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<FileUri> __insertionAdapterOfFileUri;

  private final Converters __converters = new Converters();

  private final SharedSQLiteStatement __preparedStmtOfDelete;

  public FileUriDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfFileUri = new EntityInsertionAdapter<FileUri>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `file_uris` (`_id`,`mimeTypes`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, FileUri value) {
        stmt.bindLong(1, value.getFileName());
        final String _tmp = __converters.mimeTypesToString(value.getMimeTypes());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, _tmp);
        }
      }
    };
    this.__preparedStmtOfDelete = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM file_uris WHERE _id == (?)";
        return _query;
      }
    };
  }

  @Override
  public void insert(final FileUri... fileUris) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfFileUri.insert(fileUris);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final long id) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDelete.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, id);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDelete.release(_stmt);
    }
  }

  @Override
  public FileUri getById(final long uid) {
    final String _sql = "SELECT * FROM file_uris WHERE _id == (?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, uid);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfFileName = CursorUtil.getColumnIndexOrThrow(_cursor, "_id");
      final int _cursorIndexOfMimeTypes = CursorUtil.getColumnIndexOrThrow(_cursor, "mimeTypes");
      final FileUri _result;
      if(_cursor.moveToFirst()) {
        final long _tmpFileName;
        _tmpFileName = _cursor.getLong(_cursorIndexOfFileName);
        final String[] _tmpMimeTypes;
        final String _tmp;
        if (_cursor.isNull(_cursorIndexOfMimeTypes)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getString(_cursorIndexOfMimeTypes);
        }
        _tmpMimeTypes = __converters.stringToMimeTypes(_tmp);
        _result = new FileUri(_tmpFileName,_tmpMimeTypes);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int numberWithId(final long id) {
    final String _sql = "SELECT COUNT(*) FROM file_uris WHERE _id == (?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<FileUri> getAll() {
    final String _sql = "SELECT * FROM file_uris";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfFileName = CursorUtil.getColumnIndexOrThrow(_cursor, "_id");
      final int _cursorIndexOfMimeTypes = CursorUtil.getColumnIndexOrThrow(_cursor, "mimeTypes");
      final List<FileUri> _result = new ArrayList<FileUri>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final FileUri _item;
        final long _tmpFileName;
        _tmpFileName = _cursor.getLong(_cursorIndexOfFileName);
        final String[] _tmpMimeTypes;
        final String _tmp;
        if (_cursor.isNull(_cursorIndexOfMimeTypes)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getString(_cursorIndexOfMimeTypes);
        }
        _tmpMimeTypes = __converters.stringToMimeTypes(_tmp);
        _item = new FileUri(_tmpFileName,_tmpMimeTypes);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
