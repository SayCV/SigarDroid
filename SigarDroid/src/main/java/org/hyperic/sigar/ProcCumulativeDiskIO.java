/*****************************************************
 * WARNING: this file was generated by -e
 * on Mon Jan 13 23:21:07 2014.
 * Any changes made here will be LOST.
 *****************************************************/
package org.hyperic.sigar;

import java.util.HashMap;
import java.util.Map;

/**
 * ProcCumulativeDiskIO sigar class.
 */
public class ProcCumulativeDiskIO implements java.io.Serializable {

    private static final long serialVersionUID = 4879L;

    public ProcCumulativeDiskIO() { }

    public native void gather(Sigar sigar, long pid) throws SigarException;

    /**
     * This method is not intended to be called directly.
     * use Sigar.getProcCumulativeDiskIO() instead.
     * @exception SigarException on failure.
     * @see org.hyperic.sigar.Sigar#getProcCumulativeDiskIO
     */
    static ProcCumulativeDiskIO fetch(Sigar sigar, long pid) throws SigarException {
        ProcCumulativeDiskIO procCumulativeDiskIO = new ProcCumulativeDiskIO();
        procCumulativeDiskIO.gather(sigar, pid);
        return procCumulativeDiskIO;
    }

    long bytesRead = 0;

    /**
     * Get the Bytes Read from Start.<p>
     * Supported Platforms: Linux, Win32.
     * <p>
     * @return Bytes Read from Start
     */
    public long getBytesRead() { return bytesRead; }
    long bytesWritten = 0;

    /**
     * Get the Bytes Written from Start.<p>
     * Supported Platforms: Linux, Win32.
     * <p>
     * @return Bytes Written from Start
     */
    public long getBytesWritten() { return bytesWritten; }
    long bytesTotal = 0;

    /**
     * Get the Bytes Total from Start.<p>
     * Supported Platforms: Linux, Win32, AIX, HPUX, Solaris.
     * <p>
     * @return Bytes Total from Start
     */
    public long getBytesTotal() { return bytesTotal; }

    void copyTo(ProcCumulativeDiskIO copy) {
        copy.bytesRead = this.bytesRead;
        copy.bytesWritten = this.bytesWritten;
        copy.bytesTotal = this.bytesTotal;
    }

    public Map toMap() {
        Map map = new HashMap();
        String strbytesRead = 
            String.valueOf(this.bytesRead);
        if (!"-1".equals(strbytesRead))
            map.put("BytesRead", strbytesRead);
        String strbytesWritten = 
            String.valueOf(this.bytesWritten);
        if (!"-1".equals(strbytesWritten))
            map.put("BytesWritten", strbytesWritten);
        String strbytesTotal = 
            String.valueOf(this.bytesTotal);
        if (!"-1".equals(strbytesTotal))
            map.put("BytesTotal", strbytesTotal);
        return map;
    }

    public String toString() {
        return toMap().toString();
    }

}
