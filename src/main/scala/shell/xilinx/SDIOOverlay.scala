// See LICENSE for license details.
package sifive.fpgashells.shell.xilinx

import chisel3._
import freechips.rocketchip.diplomacy._
import sifive.fpgashells.shell._
import sifive.fpgashells.ip.xilinx._

abstract class SDIOXilinxPlacedOverlay(name: String, di: SDIODesignInput, si: SDIOShellInput)
  extends SDIOPlacedOverlay(name, di, si)
{
  def shell: XilinxShell
}
