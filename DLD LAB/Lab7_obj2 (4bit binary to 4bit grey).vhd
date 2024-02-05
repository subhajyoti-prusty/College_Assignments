----------------------------------------------------------------------------------
-- Company: 
-- Engineer: 
-- 
-- Create Date: 05.02.2024 12:51:14
-- Design Name: 
-- Module Name: Lab7_obj2 - Behavioral
-- Project Name: 
-- Target Devices: 
-- Tool Versions: 
-- Description: 
-- 
-- Dependencies: 
-- 
-- Revision:
-- Revision 0.01 - File Created
-- Additional Comments:
-- 
----------------------------------------------------------------------------------


library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

-- Uncomment the following library declaration if using
-- arithmetic functions with Signed or Unsigned values
--use IEEE.NUMERIC_STD.ALL;

-- Uncomment the following library declaration if instantiating
-- any Xilinx leaf cells in this code.
--library UNISIM;
--use UNISIM.VComponents.all;

entity Lab7_obj2 is
    Port ( b0,b1,b2,b3 : in STD_LOGIC;
           g0,g1,g2,g3 : out STD_LOGIC);
end Lab7_obj2;

architecture dataflow of Lab7_obj2 is

begin
g0 <= b1 xor b0;
g1 <= b2 xor b1;
g2 <= b3 xor b2;
g3 <= b3;

end dataflow;

